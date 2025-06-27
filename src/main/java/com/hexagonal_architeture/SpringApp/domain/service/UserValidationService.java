package com.hexagonal_architeture.SpringApp.domain.service;

import com.hexagonal_architeture.SpringApp.domain.model.User;

public class UserValidationService {

    public static boolean validateUser(User user) {
        return user.firstname() != null && user.lastName() != null;
    }
}
