package com.example.springbootmonolith.Service;

import com.example.springbootmonolith.model.Post;
import org.springframework.http.HttpStatus;

public interface PostService {

    public Post createPost(Post post);

    public Iterable<Post> listPosts();

    public HttpStatus deletePost(Long postId);
}
