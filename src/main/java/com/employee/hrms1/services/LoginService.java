package com.employee.hrms1.services;

import org.springframework.stereotype.Service;

@Service
public class LoginService {
    public boolean validateUser(String username, String password) {
        return "admin".equals(username) && "password123".equals(password);
    }
}


