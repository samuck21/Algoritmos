package com.svstudio.apirest.controllers;

import com.svstudio.apirest.dto.user.CreateUserRequest;
import com.svstudio.apirest.models.User;
import com.svstudio.apirest.services.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/users")
public class UserControllers {
@Autowired
    private UserService userService;
@PostMapping
public ResponseEntity<User> create (@RequestBody CreateUserRequest request){
        User user = userService.create(request);
        return ResponseEntity.ok(user);
    }
}
