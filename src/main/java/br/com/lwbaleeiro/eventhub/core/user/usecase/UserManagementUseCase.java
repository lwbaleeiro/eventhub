package br.com.lwbaleeiro.eventhub.core.user.usecase;

import br.com.lwbaleeiro.eventhub.core.user.model.User;

public interface UserManagementUseCase {
    String register(User user);
    String authentication(String email, String password);
}
