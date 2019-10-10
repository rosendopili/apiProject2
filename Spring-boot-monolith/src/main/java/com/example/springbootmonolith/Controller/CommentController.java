package com.example.springbootmonolith.Controller;

import com.example.springbootmonolith.Service.CommentService;
import com.example.springbootmonolith.model.Comment;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

@RestController
public class CommentController {

    @Autowired
    CommentService commentService;

    @PostMapping("/comment/{username}/{postId}")
    public Comment createComment(@RequestBody Comment newComment, long postId) {
        return commentService.createComment(newComment, postId);
    }

    @GetMapping("/comment/list")
    public Iterable<Comment> listComments() { return commentService.listComments(); }

    @DeleteMapping("/comment/delete/{commentId}")
    public HttpStatus deleteComment(Long commentId) { return commentService.deleteComment(commentId); }

}
