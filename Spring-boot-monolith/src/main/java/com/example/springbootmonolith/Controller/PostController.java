package com.example.springbootmonolith.Controller;

import com.example.springbootmonolith.Service.PostService;
import com.example.springbootmonolith.model.Post;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("users/{username}/{post_id}")
public class PostController {

    @Autowired
    public PostService postService;

    @PostMapping("/user/{username}/{postId}")
    public Post createPost(@RequestBody Post post) {
        return postService.createPost(post);
    }
    @GetMapping("/user/{username}/{postId}/list")
    public Iterable<Post> listPosts() {
        return postService.listPosts();
    }

    @DeleteMapping("/user/{username}/{postId}")
    public HttpStatus deletePost(long postId) {
        return postService.deletePost(postId);
    }


}
