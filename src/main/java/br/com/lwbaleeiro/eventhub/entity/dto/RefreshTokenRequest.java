package br.com.lwbaleeiro.eventhub.entity.dto;

import lombok.Builder;

@Builder
public record RefreshTokenRequest(String refreshToken) {
}
