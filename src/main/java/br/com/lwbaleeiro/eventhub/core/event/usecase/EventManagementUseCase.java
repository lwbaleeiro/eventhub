package br.com.lwbaleeiro.eventhub.core.event.usecase;

import br.com.lwbaleeiro.eventhub.core.event.model.Event;

import java.util.List;

public interface EventManagementUseCase {
    Event createEvent(Event event);
    List<Event> getAllEvents();
}
