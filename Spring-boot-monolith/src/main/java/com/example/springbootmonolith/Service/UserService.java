package com.example.springbootmonolith.Service;

import com.example.springbootmonolith.model.Post;
import com.example.springbootmonolith.model.User;
import org.springframework.http.HttpStatus;
import org.springframework.security.core.userdetails.UserDetailsService;

public interface UserService extends UserDetailsService {

    /**
     *
     * @param user
     * @return
     */
    public String login (User user);

    /**
     *
     * @param newUser
     * @return
     */
    public String createUser (User newUser);


    /**
     *
     * @return
     */
    public Iterable<User> listUsers();

    /**
     *
     * @param username
     * @return
     */
    public User getUser(String username);

    /**
     *
     * @param userId
     * @return
     */
    public HttpStatus deleteById(long userId);
}
