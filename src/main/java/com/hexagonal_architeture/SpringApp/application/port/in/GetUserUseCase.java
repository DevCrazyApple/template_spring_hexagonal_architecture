package com.hexagonal_architeture.SpringApp.application.port.in;

import com.hexagonal_architeture.SpringApp.domain.model.User;

import java.util.Optional;

public interface GetUserUseCase {
    Optional<User> findById(Long id);
}
