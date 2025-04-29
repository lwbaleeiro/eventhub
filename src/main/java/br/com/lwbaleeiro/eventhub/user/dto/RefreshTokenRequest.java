package br.com.lwbaleeiro.eventhub.user.dto;

import lombok.Builder;

@Builder
public record RefreshTokenRequest(String refreshToken) {
}
