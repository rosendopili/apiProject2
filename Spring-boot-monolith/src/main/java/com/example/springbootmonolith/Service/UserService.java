package com.example.springbootmonolith.Service;

<<<<<<< HEAD
import com.example.springbootmonolith.model.User;
import org.springframework.stereotype.Service;

//@Service
//public interface UserService {

//    public String login (User user);
//
//    public User addUser (User newUser);
//
//    public User addPost(String username, long postId);
//
//    public User addComment(String username,long commentId);
//
//    public Iterable<User> listUsers();
//
//    public User getUser(String username);
//
//}
=======
import com.example.springbootmonolith.Model.User;

public interface UserService {

    public String login (User user);

    public User createUser (User newUser);

    public User addPost(String username, long postId);

    public User addComment(String username,long commentId);

    public Iterable<User> listUsers();

    public User getUser(String username);

}
>>>>>>> e407c732d45f0736295a89311e30d7d04418e188
