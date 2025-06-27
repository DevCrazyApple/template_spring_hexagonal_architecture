package com.hexagonal_architeture.SpringApp.infrastructure.controller.dto;

public record UserRequest(
        String firstName,
        String lastName
) {
}
