package com.example.apiPROJECT.service;

import com.example.apiPROJECT.model.User;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;

@Service
public interface UserService {

    public String login (User user);

    public User createUser (User newUser);

    public String addPost(String title, String body);

    public String addComment(String title, String body);

    public HttpStatus deleteById(long userId);

    public Iterable<User> listUsers();

}
