package com.example.springbootmonolith.Service;

import com.example.springbootmonolith.model.Comment;
import org.springframework.http.HttpStatus;

public interface CommentService {

    public Comment createComment (Comment comment);

    public Iterable<Comment> listComments();

    public HttpStatus deleteComment(Long commentId);
}
