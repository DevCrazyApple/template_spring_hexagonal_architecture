package com.hexagonal_architeture.SpringApp.application.service;

import com.hexagonal_architeture.SpringApp.application.port.in.CreateUserUseCase;
import com.hexagonal_architeture.SpringApp.application.port.in.GetUserUseCase;
import com.hexagonal_architeture.SpringApp.application.port.out.UserRepositoryPort;
import com.hexagonal_architeture.SpringApp.domain.model.User;
import com.hexagonal_architeture.SpringApp.domain.service.UserValidationService;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class UserService implements CreateUserUseCase, GetUserUseCase {

    private final UserRepositoryPort userRepositoryPort;

    public UserService(UserRepositoryPort userRepositoryPort) {
        this.userRepositoryPort = userRepositoryPort;
    }

    @Override
    public User createUser(User user) {
        if (!UserValidationService.validateUser(user)) {
            throw new IllegalArgumentException("Invalid user");
        }
        return this.userRepositoryPort.saveUser(user);
    }

    @Override
    public Optional<User> findById(Long id) {
        return this.userRepositoryPort.findById(id);
    }
}
