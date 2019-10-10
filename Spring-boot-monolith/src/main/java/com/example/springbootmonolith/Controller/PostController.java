package com.example.springbootmonolith.Controller;

import com.example.springbootmonolith.Service.PostService;
import com.example.springbootmonolith.model.Post;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

@RestController
public class PostController {

    @Autowired
    public PostService postService;

    @PostMapping("/post/{username}")
    public Post createPost(@RequestBody Post newPost, @PathVariable String username) {
        return postService.createPost(newPost, username);
    }

    @GetMapping("post/all/list")
    public Iterable<Post> listPosts() {
        return postService.listPosts();
    }

    @DeleteMapping("post/delete/{postId}")
    public HttpStatus deletePost(Long postId) {
        return postService.deletePost(postId);
    }

}
