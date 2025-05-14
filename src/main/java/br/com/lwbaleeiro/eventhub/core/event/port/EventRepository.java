package br.com.lwbaleeiro.eventhub.core.event.port;

import br.com.lwbaleeiro.eventhub.core.event.model.Event;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EventRepository extends JpaRepository<Event, Long> {
}
