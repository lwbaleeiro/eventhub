package br.com.lwbaleeiro.eventhub.infrastructure.web.user.dto;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import lombok.Builder;

@Builder
public record UserRequest(@NotNull @NotBlank String email,
                          @NotNull @NotBlank String password) {
}
