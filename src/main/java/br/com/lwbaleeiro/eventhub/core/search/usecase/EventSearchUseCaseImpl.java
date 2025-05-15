package br.com.lwbaleeiro.eventhub.core.search.usecase;

import br.com.lwbaleeiro.eventhub.core.event.model.Event;
import br.com.lwbaleeiro.eventhub.infrastructure.persistence.search.CachedEventSearchService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EventSearchUseCaseImpl implements EventSearchUseCase {

    private final CachedEventSearchService cachedEventSearchService;

    @Autowired
    public EventSearchUseCaseImpl(CachedEventSearchService cachedEventSearchService) {
        this.cachedEventSearchService = cachedEventSearchService;
    }

    @Override
    public List<Event> searchByTitlePrefix(String prefix) {
        return cachedEventSearchService.search(prefix);
    }
}
