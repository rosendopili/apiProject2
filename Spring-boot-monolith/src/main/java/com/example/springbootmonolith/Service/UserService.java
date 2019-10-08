package com.example.springbootmonolith.Service;

import com.example.springbootmonolith.Model.User;

public interface UserService {

    public String login (User user);

    public User createUser (User newUser);

    public User addPost(String username, long postId);

    public User addComment(String username,long commentId);

    public Iterable<User> listUsers();

    public User getUser(String username);

}
