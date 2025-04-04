package br.com.lwbaleeiro.eventhub.entity.dto;

import lombok.Builder;

@Builder
public record RegisterRequest(String email,
                              String password) {
}
