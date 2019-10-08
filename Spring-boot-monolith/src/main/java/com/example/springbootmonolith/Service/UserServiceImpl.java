package com.example.springbootmonolith.Service;

import com.example.springbootmonolith.Config.JwtUtil;
import com.example.springbootmonolith.Repository.CommentRepository;
import com.example.springbootmonolith.Repository.PostRepository;
import com.example.springbootmonolith.Repository.UserRepository;
import com.example.springbootmonolith.model.Comment;
import com.example.springbootmonolith.model.Post;
import com.example.springbootmonolith.model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class UserServiceImpl implements UserService{

    @Autowired
    UserRepository userRepository;

    @Autowired
    UserService userService;

    @Autowired
    PostService postService;

    @Autowired
    PostRepository postRepository;

    @Autowired
    CommentRepository commentRepository;

    @Autowired
    JwtUtil jwtUtil;

    @Override
    public String login(User user){
        User newUser = userRepository.findByUsername(user.getUsername());
        if(newUser != null && user.getPassword().equals(newUser.getPassword())){
            UserDetails userDetails = loadUserByUsername(newUser.getUsername());

            return jwtUtil.generateToken(userDetails);
        }
        return null;
    }

    @Override
    public String createUser(User newUser) {
        newUser.setUsername(newUser.getUsername());
        newUser.setPassword(newUser.getPassword());
        if(userRepository.save(newUser) != null){
            UserDetails userDetails = loadUserByUsername(newUser.getUsername());
            return jwtUtil.generateToken(userDetails);
        }
        return null;
    }

    @Override
    public User addPost(String username, long postId) {
        Post post = postRepository.findById(postId).get();
        User user = getUser(username);
        user.addPost(post);

        return userRepository.save(user);
    }

    @Override
    public User addComment(String username, long commentId) {
        Comment comment = commentRepository.findById(commentId).get();
        User user = getUser(username);
        user.addComment(comment);

        return userRepository.save(user);
    }

    @Override
    public Iterable<User> listUsers() {
        return userRepository.findAll();
    }

    @Override
    public User getUser(String username) {
        return userRepository.findByUsername(username);
    }

    @Override
    public HttpStatus deleteById(Long userId) {
        userRepository.deleteById(userId);
        return HttpStatus.OK;
    }

    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
        User user = getUser(username);

        if(user==null)
            throw new UsernameNotFoundException("User null");
        // Code edited to not include bCrypt
        return new org.springframework.security.core.userdetails.User(user.getUsername(), user.getPassword(),
                true, true, true, true, getGrantedAuthorities(user));
    }

    private List<GrantedAuthority> getGrantedAuthorities(User user){
        List<GrantedAuthority> authorities = new ArrayList<>();

        authorities.add(new SimpleGrantedAuthority(user.getUsername()));

        return authorities;
    }


}
