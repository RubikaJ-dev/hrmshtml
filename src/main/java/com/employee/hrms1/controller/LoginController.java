package com.employee.hrms1.controller;

import com.employee.hrms1.services.LoginService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class LoginController {

    @Autowired
    private LoginService loginService;

    @GetMapping("/login")
    public String showLoginForm() {
        return "login"; // This will render login.html
    }

    @PostMapping("/")
    public String login(@RequestParam String username, @RequestParam String password, Model model) {
        boolean isValid = loginService.validateUser(username, password);

        if (isValid) {
            return "redirect:/index"; // or "index" if you're using Thymeleaf
        } else {
            model.addAttribute("error", "Invalid username or password");
            return "login"; // stays on login page
        }
    }
}