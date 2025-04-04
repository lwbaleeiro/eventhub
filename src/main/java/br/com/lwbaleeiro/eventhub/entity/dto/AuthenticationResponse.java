package br.com.lwbaleeiro.eventhub.entity.dto;

import lombok.Builder;

@Builder
public record AuthenticationResponse(String token,
                                     String refreshToken) {
}
