package com.hexagonal_architeture.SpringApp.infrastructure.controller.dto;

import com.hexagonal_architeture.SpringApp.application.port.in.CreateUserUseCase;
import com.hexagonal_architeture.SpringApp.application.service.UserService;
import com.hexagonal_architeture.SpringApp.domain.model.User;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/users")
public class UserController {

    private final UserService userService;

    public UserController(UserService userService) {
        this.userService = userService;
    }

    @PostMapping
    public UserResponse createUser(@RequestBody UserRequest userRequest) {
        final User user = new User(null, userRequest.firstName(), userRequest.lastName());
        final User userCreated =  this.userService.createUser(user);
        return new UserResponse(userCreated.id(), userCreated.firstname(), userCreated.lastName());
    }

    @GetMapping("/{id}")
    public  UserResponse getUser(@PathVariable Long id) {
        final User user = this.userService.findById(id).orElseThrow(() -> new IllegalArgumentException("User not found"));
        return new UserResponse(user.id(), user.firstname(), user.lastName());
    }

}
