package com.expense.smartexpensemanagement.controller;

import com.expense.smartexpensemanagement.entity.User;
import com.expense.smartexpensemanagement.security.JwtService;
import com.expense.smartexpensemanagement.service.UserService;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/users")
public class UserController {

    private final UserService userService;
    private final PasswordEncoder passwordEncoder;
    private final JwtService jwtService;

    public UserController(UserService userService,
                          PasswordEncoder passwordEncoder,
                          JwtService jwtService) {
        this.userService = userService;
        this.passwordEncoder = passwordEncoder;
        this.jwtService = jwtService;
    }

    @PostMapping("/register")
    public User registerUser(@RequestBody User user) {
        return userService.registerUser(user);
    }

    @GetMapping("/{email}")
    public User getUserByEmail(@PathVariable String email) {
        return userService.getUserByEmail(email);
    }

    @PostMapping("/login")
    public String login(@RequestParam String email,
                        @RequestParam String password) {

        User user = userService.getUserByEmail(email);

        if (user != null && passwordEncoder.matches(password, user.getPassword())) {
            return jwtService.generateToken(user.getEmail());
        }

        return "Invalid email or password!";
    }
}