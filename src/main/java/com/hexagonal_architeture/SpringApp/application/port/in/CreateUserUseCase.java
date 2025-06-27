package com.hexagonal_architeture.SpringApp.application.port.in;

import com.hexagonal_architeture.SpringApp.domain.model.User;

public interface CreateUserUseCase {
    User createUser(User user);
}
