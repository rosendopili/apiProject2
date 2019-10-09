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

    @PostMapping("/post")
    public Post createPost(@RequestBody Post post) {
        return postService.createPost(post);
    }
    @GetMapping("post/list")
    public Iterable<Post> listPosts() {
        return postService.listPosts();
    }

    @DeleteMapping("post/delete")
    public HttpStatus deletePost(long postId) {
        return postService.deletePost(postId);
    }


}
