package com.example.springbootmonolith.Service;

import com.example.springbootmonolith.Model.Post;

public interface PostService {

    public Post createPost(Post post);

    public Iterable<Post> listPosts();

    public Post deletePost(Post post);
}
