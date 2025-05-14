package br.com.lwbaleeiro.eventhub.core.notification.port;

import br.com.lwbaleeiro.eventhub.core.notification.model.Notification;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface NotificationRepository extends JpaRepository<Notification, Long> {
}
