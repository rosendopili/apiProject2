package com.example.apiPROJECT.service;

import org.springframework.stereotype.Service;

//
//import com.example.apiPROJECT.model.User;
//import com.example.apiPROJECT.repository.CommentRepository;
//import com.example.apiPROJECT.repository.PostRepository;
//import com.example.apiPROJECT.repository.UserRepository;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.http.HttpStatus;
//import org.springframework.stereotype.Service;
//
//@Service
//public class UserServiceImpl implements UserService {
//
//    @Autowired
//    UserRepository userRepository;
//
//    @Autowired
//    PostRepository postRepository;
//
//    @Autowired
//    CommentRepository commentRepository;
//
//
//    @Override
//    public String login(User user) {
//        User newUser = userRepository.findByUsername(user.getUsername());
//
//        return null;
//    }
//
//    @Override
//    public User createUser(User newUser) {
//      return userRepository.save(newUser);
//    }
//
//    @Override
//    public String addPost(String title, String body) {
//        return userRepository.findByPostId(addPost());
//    }
//
//    @Override
//    public String addComment(String title, String body) {
//        return null;
//    }
//
//    @Override
//    public HttpStatus deleteById(long userId) {
//        return null;
//    }
//
//    @Override
//    public Iterable<User> listUsers() {
//        return null;
//    }
//}
