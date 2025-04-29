package br.com.lwbaleeiro.eventhub.notification.entity;

import br.com.lwbaleeiro.eventhub.user.entity.User;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "notification")
public class Notification {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    @ManyToOne
    @Column(nullable = false)
    private User user;
    @Column(nullable = false)
    private String message;
    @Column(nullable = false)
    private Date sendingDate;
}
