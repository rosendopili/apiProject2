package com.example.springbootmonolith.Service;

import com.example.springbootmonolith.Repository.CommentRepository;
import com.example.springbootmonolith.Repository.PostRepository;
import com.example.springbootmonolith.Repository.UserRepository;
import com.example.springbootmonolith.model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements UserService{

    @Autowired
    UserRepository userRepository;

    @Autowired
    PostRepository postRepository;

    @Autowired
    CommentRepository commentRepository;

    @Override
    public String login(User user) {
        return null;
    }

    @Override
    public User createUser(User newUser) {
        return null;
    }

    @Override
    public User addPost(String username, long postId) {
        return null;
    }

    @Override
    public User addComment(String username, long commentId) {
        return null;
    }

    @Override
    public Iterable<User> listUsers() {
        return null;
    }

    @Override
    public User getUser(String username) {
        return null;
    }

}
