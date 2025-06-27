package com.hexagonal_architeture.SpringApp.application.port.out;

import com.hexagonal_architeture.SpringApp.domain.model.User;

import java.util.Optional;

public interface UserRepositoryPort {
    User saveUser(User user);
    Optional<User> findById(Long id);
}
