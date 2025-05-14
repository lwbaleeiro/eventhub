package br.com.lwbaleeiro.eventhub.infrastructure.web.event.mapper;

import br.com.lwbaleeiro.eventhub.core.event.model.Event;
import br.com.lwbaleeiro.eventhub.infrastructure.web.event.dto.EventRequest;
import br.com.lwbaleeiro.eventhub.infrastructure.web.event.dto.EventResponse;
import org.springframework.stereotype.Component;

@Component
public class EventMapper {

    public Event toDomain(EventRequest request) {

        return new Event(request.id(),
                request.title(),
                request.description(),
                request.category(),
                request.date(),
                request.local());
    }

    public EventResponse toResponseDTO(Event event) {

        return new EventResponse(
                event.getId(),
                event.getTitle(),
                event.getDescription(),
                event.getCategory(),
                event.getDate(),
                event.getLocal());
    }
}
