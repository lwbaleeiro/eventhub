package br.com.lwbaleeiro.eventhub.infrastructure.web.user.dto;

import lombok.Builder;

@Builder
public record UserRequest(String email,
                          String password) {
}
