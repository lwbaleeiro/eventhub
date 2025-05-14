package br.com.lwbaleeiro.eventhub.core.event.usecase;

import br.com.lwbaleeiro.eventhub.core.event.model.Event;

import java.util.List;

public interface EventManagementUseCase {
    Event createEvent(Event event);
    Event getEvent(Long id);
    List<Event> getAllEvents();
    Event editEvent(Event event);
    void deleteEvent(Long eventId);
}
