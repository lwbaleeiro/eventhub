package br.com.lwbaleeiro.eventhub.infrastructure.web.event.dto;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;

import java.util.Date;

public record EventRequest(@NotNull @NotBlank String title,
                           @NotNull @NotBlank String description,
                           @NotNull @NotBlank String category,
                           @NotNull Date date,
                           @NotNull @NotBlank String local ) {
}
