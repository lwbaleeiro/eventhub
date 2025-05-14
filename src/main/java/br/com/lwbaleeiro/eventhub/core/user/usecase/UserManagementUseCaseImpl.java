package br.com.lwbaleeiro.eventhub.core.user.usecase;

import br.com.lwbaleeiro.eventhub.common.util.JwtService;
import br.com.lwbaleeiro.eventhub.core.user.model.User;
import br.com.lwbaleeiro.eventhub.core.user.port.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.stereotype.Service;

@Service
public class UserManagementUseCaseImpl implements UserManagementUseCase {

    private final UserRepository userRepository;
    private final JwtService jwtService;
    private final AuthenticationManager authenticationManager;

    @Autowired
    public UserManagementUseCaseImpl(UserRepository userRepository, JwtService jwtService, AuthenticationManager authenticationManager) {
        this.userRepository = userRepository;
        this.jwtService = jwtService;
        this.authenticationManager = authenticationManager;
    }

    @Override
    public String register(User user) {

        if (userRepository.existsByEmail(user.getEmail())) {
            // TODO: Mudar para custom exception
            throw new RuntimeException("Email já está em uso");
        }

        userRepository.save(user);

        return jwtService.generateToken(user);
    }

    @Override
    public String authentication(String email, String password) {

        authenticationManager.authenticate(new UsernamePasswordAuthenticationToken(email, password));

        // TODO: Custom exeption
        var user = userRepository.findByEmail(email).orElseThrow();

        return jwtService.generateToken(user);
    }
}
