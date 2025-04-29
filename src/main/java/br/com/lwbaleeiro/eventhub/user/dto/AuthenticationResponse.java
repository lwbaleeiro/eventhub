package br.com.lwbaleeiro.eventhub.user.dto;

import lombok.Builder;

@Builder
public record AuthenticationResponse(String token,
                                     String refreshToken) {
}
