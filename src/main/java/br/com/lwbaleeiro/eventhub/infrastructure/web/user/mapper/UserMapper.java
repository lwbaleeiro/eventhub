package br.com.lwbaleeiro.eventhub.infrastructure.web.user.mapper;

import br.com.lwbaleeiro.eventhub.core.user.model.Role;
import br.com.lwbaleeiro.eventhub.core.user.model.User;
import br.com.lwbaleeiro.eventhub.infrastructure.web.user.dto.UserRequest;
import lombok.RequiredArgsConstructor;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Component;

@Component
@RequiredArgsConstructor
public class UserMapper {

    private final PasswordEncoder passwordEncoder;

    public User toDomain(UserRequest registerRequest) {
        return User.builder()
                .email(registerRequest.email())
                .password(passwordEncoder.encode(registerRequest.password()))
                .role(Role.USER)
                .build();
    }
}
