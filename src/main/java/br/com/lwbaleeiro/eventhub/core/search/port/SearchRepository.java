package br.com.lwbaleeiro.eventhub.core.search.port;

import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface SearchRepository {
    List<Long> searchEventsByPrefix(String prefix);
    void indexEvent(String eventName, Long eventId);
    void removeEvent(String eventName);
}
