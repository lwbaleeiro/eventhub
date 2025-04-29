package br.com.lwbaleeiro.eventhub.user.dto;

import lombok.Builder;

@Builder
public record AuthenticationRequest(String email,
                                    String password) {
}
