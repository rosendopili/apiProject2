package com.example.apiPROJECT.model;

import javax.persistence.*;
import javax.xml.stream.events.Comment;
import java.util.ArrayList;
import java.util.List;


//@Entity
@Table (name = "users")
public class User<Post> {
    @Id
    @Column
    @GeneratedValue (strategy = GenerationType.IDENTITY)
    private long id;

    @Column (unique = true)
    private String username;

    @Column(unique = true)
    private String email;

    @Column
    private String password;

    @OneToOne (cascade = CascadeType.ALL)
    @JoinColumn (name = "user_profile")
    private UserProfile userProfile;
    //will define params in user profile model

    @OneToMany (cascade = CascadeType.ALL)
    @JoinColumn (name = "post")
    private Post post;

    @OneToMany (cascade = CascadeType.ALL)
    @JoinColumn (name = "comment")
    private Comment comment;

    @OneToMany (cascade = {CascadeType.DETACH, CascadeType.MERGE, CascadeType.REFRESH})
    @JoinTable (name = "user_comment",
            joinColumns ={@JoinColumn(name = "user_id")},
            inverseJoinColumns = @JoinColumn(name = "comment_id"))
    private List<Post> posts;

    @OneToMany (cascade = {CascadeType.DETACH, CascadeType.MERGE, CascadeType.REFRESH})
    @JoinTable (name = "user_post",
            joinColumns = {@JoinColumn(name = "user_id")},
            inverseJoinColumns = @JoinColumn(name = "post_id"))

    private List<Comment> comments;

    public User () {}

    public List<Post> addPost(Post post){
        if (posts == null)
            posts = new ArrayList<>();
        posts.add(post);
        return posts;
    }
    public List<Comment> addComment(Comment comment){
        if (comments == null)
            comments = new ArrayList<>();
        comments.add(comment);
        return comments;
    }

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

    public void setEmail (String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public List<Post> getPosts() {
        return posts;
    }

    public void setPosts(List<Post> posts) {
        this.posts = posts;
    }

    public List<Comment> getComments() {
        return comments;
    }

    public void setComments(List<Comment> comments){
        this.comments = comments;
    }

}