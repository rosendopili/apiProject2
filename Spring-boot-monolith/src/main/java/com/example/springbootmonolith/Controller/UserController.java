package com.example.springbootmonolith.Controller;

import com.example.springbootmonolith.Service.UserService;
import com.example.springbootmonolith.model.JwtResponse;
import com.example.springbootmonolith.model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserController {

    @Autowired
    UserService userService;

    @GetMapping("/hello")
    public String helloWorld(){
        return "Hello World";
    }

    @PostMapping("/login")
    public ResponseEntity<?> login(@RequestBody User user){
        return ResponseEntity.ok(new JwtResponse(userService.login(user)));
    }

}
