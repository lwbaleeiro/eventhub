package br.com.lwbaleeiro.eventhub.core.event.usecase;

import br.com.lwbaleeiro.eventhub.core.event.model.Event;
import br.com.lwbaleeiro.eventhub.core.event.port.EventRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.NoSuchElementException;
import java.util.Optional;

@Service
public class EventManagementUseCaseImpl implements EventManagementUseCase {

    private final EventRepository eventRepository;

    @Autowired
    public EventManagementUseCaseImpl(EventRepository eventRepository) {
        this.eventRepository = eventRepository;
    }

    @Override
    public Event createEvent(Event event) {
        return eventRepository.save(event);
    }

    @Override
    public Event getEvent(Long id) {

        Optional<Event> event = eventRepository.findById(id);

        if (event.isEmpty()) {
            throw new NoSuchElementException("Event not found by id: " + id);
        }

        return event.get();
    }

    @Override
    public List<Event> getAllEvents() {
        return eventRepository.findAll();
    }

    @Override
    public Event editEvent(Event event) {

        Optional<Event> eventExist = eventRepository.findById(event.getId());

        if (eventExist.isEmpty()) {
            throw new NoSuchElementException("Event not found by id " + event.getId());
        }

        return eventRepository.save(event);
    }

    @Override
    public void deleteEvent(Long eventId) {
        Optional<Event> eventToDelete = eventRepository.findById(eventId);

        if (eventToDelete.isEmpty()) {
            throw new NoSuchElementException("Event not found by id " + eventId);
        }

        eventRepository.delete(eventToDelete.get());
    }
}
