package br.com.lwbaleeiro.eventhub.core.event.usecase;

import br.com.lwbaleeiro.eventhub.core.event.model.Event;
import br.com.lwbaleeiro.eventhub.core.event.port.EventRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EventManagementUseCaseImpl implements EventManagementUseCase {

    private final EventRepository eventRepository;

    @Autowired
    public EventManagementUseCaseImpl(EventRepository eventRepository) {
        this.eventRepository = eventRepository;
    }

    @Override
    public Event createEvent(Event event) {
        return null;
    }

    @Override
    public List<Event> getAllEvents() {
        return List.of();
    }
}
