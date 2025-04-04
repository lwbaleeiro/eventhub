package br.com.lwbaleeiro.eventhub.entity.dto;

import lombok.Builder;

@Builder
public record AuthenticationRequest(String email,
                                    String password) {
}
