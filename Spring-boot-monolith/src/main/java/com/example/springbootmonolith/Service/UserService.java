package com.example.springbootmonolith.Service;

import com.example.springbootmonolith.model.User;
import org.springframework.http.HttpStatus;
import org.springframework.security.core.userdetails.UserDetailsService;

public interface UserService extends UserDetailsService {

    public String login (User user);

    public User createUser (User newUser);

    public User addPost(String username, long postId);

    public User addComment(String username,long commentId);

    public Iterable<User> listUsers();

    public User getUser(String username);

    public HttpStatus deleteById(Long userId);
}
