package br.com.lwbaleeiro.eventhub.core.search.usecase;

import br.com.lwbaleeiro.eventhub.core.event.model.Event;

import java.util.List;

public interface EventSearchUseCase {
    List<Event> searchByTitlePrefix(String prefix);
}
