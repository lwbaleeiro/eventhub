package br.com.lwbaleeiro.eventhub.infrastructure.web.search;

import br.com.lwbaleeiro.eventhub.core.event.model.Event;
import br.com.lwbaleeiro.eventhub.core.search.usecase.EventSearchUseCase;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/search")
public class SearchController {

    private final EventSearchUseCase eventSearchUseCase;

    @Autowired
    public SearchController(EventSearchUseCase eventSearchUseCase) {
        this.eventSearchUseCase = eventSearchUseCase;
    }

    @GetMapping
    public ResponseEntity<List<Event>> searchEvents(@RequestParam String prefix) {
        List<Event> events = eventSearchUseCase.searchByTitlePrefix(prefix);
        return ResponseEntity.ok(events);
    }
}
