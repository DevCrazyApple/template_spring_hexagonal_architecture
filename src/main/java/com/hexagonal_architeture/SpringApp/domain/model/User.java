package com.hexagonal_architeture.SpringApp.domain.model;

public record User (
    Long id,
    String firstname,
    String lastName
) {
}
