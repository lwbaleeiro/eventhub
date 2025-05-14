package br.com.lwbaleeiro.eventhub.infrastructure.web.user;

import br.com.lwbaleeiro.eventhub.core.user.usecase.UserManagementUseCase;
import br.com.lwbaleeiro.eventhub.infrastructure.web.user.dto.UserRequest;
import br.com.lwbaleeiro.eventhub.infrastructure.web.user.mapper.UserMapper;
import jakarta.validation.Valid;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("api/user")
@RequiredArgsConstructor
public class UserController {

    private final UserManagementUseCase userManagementUseCase;
    private final UserMapper userMapper;

    @PostMapping("/register")
    public ResponseEntity<String> register(@Valid @RequestBody UserRequest request) {

        var user = userMapper.toDomain(request);
        return ResponseEntity.ok(userManagementUseCase.register(user));
    }

    @PostMapping("/login")
    public ResponseEntity<String> authenticate(@Valid @RequestBody UserRequest request) {

        String authentication = userManagementUseCase.authentication(request.email(), request.password());
        return ResponseEntity.ok(authentication);
    }
}
