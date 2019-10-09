package com.example.springbootmonolith.Service;

import com.example.springbootmonolith.model.Post;
import org.springframework.http.HttpStatus;

public interface PostService {

    /**
     *
     * @param post
     * @return
     */
    public Post createPost(Post post);

    /**
     *
     * @return
     */
    public Iterable<Post> listPosts();

    /**
     *
     * @param postId
     * @return
     */
    public HttpStatus deletePost(Long postId);
}
