package com.example.springbootmonolith.Service;

import com.example.springbootmonolith.Repository.CommentRepository;
import com.example.springbootmonolith.Repository.PostRepository;
import com.example.springbootmonolith.Repository.UserRepository;
import com.example.springbootmonolith.model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

//@Service
//public class UserServiceImpl implements UserService{

//    @Autowired
//    UserRepository userRepository;
//
//    @Autowired
//    PostRepository postRepository;
//
//    @Autowired
//    CommentRepository commentRepository;
//
//    @Override
//    public String login(User user) {
//        User newUser = userRepository.findByUsername(user.getUsername());
//        return null;
//    }
//
//    @Override
//    public User addUser(User newUser) {
//        return userRepository.createUser(newUser);
//    }
//
//    @Override
//    public User addPost(String username, long postId) {
//        return userRepository.createPost(username, postId);
//    }
//
//    @Override
//    public User addComment(String username, long commentId) {
//        return userRepository.createComment(username, commentId);}
//
//
//    @Override
//    public Iterable<User> listUsers() {
//        return userRepository.findAll();
//    }
//
//    @Override
//    public User getUser(String username) {
//        return userRepository.findByUsername(username);
//    }
//
//}
