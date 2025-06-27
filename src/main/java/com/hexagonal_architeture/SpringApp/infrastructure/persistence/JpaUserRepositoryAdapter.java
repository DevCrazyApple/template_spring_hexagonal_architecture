package com.hexagonal_architeture.SpringApp.infrastructure.persistence;

import com.hexagonal_architeture.SpringApp.application.port.out.UserRepositoryPort;
import com.hexagonal_architeture.SpringApp.domain.model.User;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public class JpaUserRepositoryAdapter implements UserRepositoryPort {

    private final SpringDataUserRepository springDataUserRepository;

    public JpaUserRepositoryAdapter(SpringDataUserRepository springDataUserRepository) {
        this.springDataUserRepository = springDataUserRepository;
    }

    @Override
    public User saveUser(User user) {
        UserEntity userEntity = new UserEntity(user.id(), user.firstname(), user.lastName());
        final UserEntity savedUser = this.springDataUserRepository.save(userEntity);
        return new User(savedUser.getId(), savedUser.getFirstName(), savedUser.getLastName());
    }

    @Override
    public Optional<User> findById(Long id) {
        final UserEntity savedUser = this.springDataUserRepository.findById(id).orElseThrow(() -> new IllegalArgumentException("Users empty"));
        return Optional.of(new User(savedUser.getId(), savedUser.getFirstName(), savedUser.getLastName()));
    }
}
