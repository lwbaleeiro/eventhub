package br.com.lwbaleeiro.eventhub.infrastructure.web.event.dto;

import java.util.Date;

public record EventResponse(Long id,
                            String title,
                            String description,
                            String category,
                            Date date,
                            String local) {
}
