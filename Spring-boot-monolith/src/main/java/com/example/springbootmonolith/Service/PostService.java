package com.example.springbootmonolith.Service;

import com.example.springbootmonolith.model.Post;

public interface PostService {

    public Post createPost(Post post);

    public Iterable<Post> listPosts();

}
