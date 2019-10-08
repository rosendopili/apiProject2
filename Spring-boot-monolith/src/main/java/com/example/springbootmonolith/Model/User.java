package com.example.springbootmonolith.Model;


import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;



@Entity
@Table (name = "users")
public class User {
    @Id
    @Column
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    @Column(unique = true)
    private String username;

    @Column(unique = true)
    private String email;

    @Column
    private String password;

    @OneToOne (cascade = CascadeType.ALL)
    @JoinColumn (name = "user_profile_id")
    private UserProfile userProfile;

    @OneToMany(mappedBy = "user",
    cascade = CascadeType.ALL)
    private List<Post> posts;

    @OneToMany(mappedBy = "user",
            cascade = CascadeType.ALL)
        private List<Comment> comments;

    public User() {
    }

    public List<Comment> addComment (Comment comment){
        if (comments == null)
            comments = new ArrayList<>();
        comments.add(comment);

        return comments;
    }

    public List<Post> addPost (Post post){
        if (posts == null)
            posts = new ArrayList<>();
        posts.add(post);

        return posts;
    }

    public List<Comment> getComments(){return comments;}

    public void setComments(List<Comment> comments){this.comments = comments;}

    public List<Post> getPosts(){return posts;}

    public void setPosts(List<Post> posts){this.posts = posts;}

    public UserProfile getUserProfile(){return userProfile;}

    public void setUserProfile(UserProfile userProfile){this.userProfile = userProfile;}

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

}