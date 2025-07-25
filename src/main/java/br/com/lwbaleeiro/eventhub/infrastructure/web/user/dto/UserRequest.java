package br.com.lwbaleeiro.eventhub.infrastructure.web.user.dto;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;

public record UserRequest(@NotNull @NotBlank String email,
                          @NotNull @NotBlank String password) {
}
