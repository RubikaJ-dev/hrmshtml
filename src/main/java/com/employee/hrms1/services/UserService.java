package com.employee.hrms1.services;

import com.employee.hrms1.model.User;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import java.util.ArrayList;

@Service
public class UserService {

    private  static final ArrayList<User> users = new ArrayList<>();

    public void addUser(User user){
        UserService.users.add(user);
    }

    public boolean isUserExists(User user){
        return UserService.users.stream().anyMatch(obj->obj.getEmail().equalsIgnoreCase(user.getEmail()));
    }
}
