package br.com.lwbaleeiro.eventhub.infrastructure.web.event;

import br.com.lwbaleeiro.eventhub.core.event.model.Event;
import br.com.lwbaleeiro.eventhub.core.event.usecase.EventManagementUseCase;
import br.com.lwbaleeiro.eventhub.infrastructure.web.event.dto.EventRequest;
import br.com.lwbaleeiro.eventhub.infrastructure.web.event.dto.EventResponse;
import br.com.lwbaleeiro.eventhub.infrastructure.web.event.mapper.EventMapper;
import jakarta.validation.Valid;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.stream.Collectors;

@RestController
@RequestMapping("api/event")
@RequiredArgsConstructor
public class EventController {

    private final EventManagementUseCase eventManagementUseCase;
    private final EventMapper eventMapper;

    @PostMapping("/create")
    public ResponseEntity<EventResponse> createEvent(@Valid @RequestBody EventRequest eventRequest) {

        Event event = eventMapper.toDomain(eventRequest);
        Event created = eventManagementUseCase.createEvent(event);

        return ResponseEntity.ok(eventMapper.toResponseDTO(created));
    }

    @GetMapping("/listAll")
    public ResponseEntity<List<EventResponse>> listAllEvent() {

        List<Event> events = eventManagementUseCase.getAllEvents();

        List<EventResponse> eventResponses = events.stream()
                .map(eventMapper::toResponseDTO)
                .collect(Collectors.toList());

        return ResponseEntity.ok(eventResponses);
    }
}
