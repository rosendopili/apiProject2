package com.example.springbootmonolith.Controller;

import com.example.springbootmonolith.Repository.UserRepository;
import com.example.springbootmonolith.Service.UserService;
import com.example.springbootmonolith.model.JwtResponse;
import com.example.springbootmonolith.model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
public class UserController {

    @Autowired
    UserService userService;

    @Autowired
    UserRepository userRepository;

    @GetMapping("/hello")
    public String helloWorld(){
        return "Hello World";
    }

    @PostMapping("/login")
    public ResponseEntity<?> login(@RequestBody User user){
        return ResponseEntity.ok(new JwtResponse(userService.login(user)));
    }

    @PostMapping("/signup")
    public ResponseEntity<?> createUser(@RequestBody User newUser){
        return ResponseEntity.ok(new JwtResponse(userService.createUser(newUser)));
    }

    @PutMapping("/user/{username}/{postId}")
    public User addPost(@PathVariable String username, @PathVariable long postId){
        return userService.addPost(username, postId);
    }

    @PutMapping("/user/{username}/{commentId}")
    public User addComment(@PathVariable String username, @PathVariable long commentId){
        return userService.addComment(username, commentId);
    }

    @DeleteMapping("/user/{userId}")
    public HttpStatus deleteUserById(@PathVariable Long userId) {
        return userService.deleteById(userId);
    }

}
