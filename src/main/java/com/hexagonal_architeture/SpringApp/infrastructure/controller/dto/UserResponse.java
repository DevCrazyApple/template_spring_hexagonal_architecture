package com.hexagonal_architeture.SpringApp.infrastructure.controller.dto;

public record UserResponse(
        Long id,
        String firstName,
        String lastName
) {
}
