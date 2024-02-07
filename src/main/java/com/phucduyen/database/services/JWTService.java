package com.phucduyen.database.services;

import org.springframework.security.core.userdetails.UserDetails;

public interface JWTService {
    String extractEmail(String token);

    String generateToken(UserDetails userDetails);

    boolean checkTokenIsValid(String token);
}
