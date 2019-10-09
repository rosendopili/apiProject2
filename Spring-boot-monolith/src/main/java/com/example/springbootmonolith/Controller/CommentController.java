package com.example.springbootmonolith.Controller;

import com.example.springbootmonolith.Service.CommentService;
import com.example.springbootmonolith.model.Comment;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/comments")
public class CommentController {

    @Autowired
    CommentService commentService;

    @PostMapping("/user/{username}/{commentId}")
    public Comment createComment(@RequestBody Comment comment) {
        return commentService.createComment(comment);
    }

    @GetMapping("/user/{username}/{commentId}/list")
    public Iterable<Comment> listComments() { return commentService.listComments(); }

    @DeleteMapping("/user/{username}/{commentId}")
    public HttpStatus deleteComment(Long commentId) { return commentService.deleteComment(commentId); }

}
