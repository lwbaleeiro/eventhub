package br.com.lwbaleeiro.eventhub.infrastructure.persistence.search;

import br.com.lwbaleeiro.eventhub.core.event.model.Event;
import br.com.lwbaleeiro.eventhub.core.event.port.EventRepository;
import br.com.lwbaleeiro.eventhub.core.search.model.Trie;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.stereotype.Service;

import java.time.Duration;
import java.util.List;
import java.util.Locale;
import java.util.Set;

@Service
public class CachedEventSearchService {

    private final RedisTemplate<String, Set<Long>> redisTemplate;
    private final EventRepository eventRepository;
    private final Trie trie = new Trie();

    public CachedEventSearchService(RedisTemplate<String, Set<Long>> redisTemplate, EventRepository eventRepository) {
        this.redisTemplate = redisTemplate;
        this.eventRepository = eventRepository;
        loadTrie();
    }

    private void loadTrie() {
        List<Event> events = eventRepository.findAll();
        for (Event event : events) {
            trie.insert(event.getTitle(), event.getId());
        }
    }

    public List<Event> search(String prefix) {
        String key = "search:" + prefix.toLowerCase();
        Set<Long> ids = redisTemplate.opsForValue().get(key);

        if (ids == null) {
            ids = trie.search(prefix);
            redisTemplate.opsForValue().set(key, ids, Duration.ofMinutes(10));
        }

        return eventRepository.findAllById(ids);
    }

    public void indexNewEvent(Event event) {
        trie.insert(event.getTitle(), event.getId());

        String prefix = event.getTitle().substring(0, Math.min(3, event.getTitle().length())).toLowerCase();
        redisTemplate.delete("search:" + prefix);
    }
}
