package com.example.springbootmonolith.Service;

import com.example.springbootmonolith.model.Comment;
import org.springframework.http.HttpStatus;

public interface CommentService {

    /**
     *
     * @param comment
     * @return
     */
    public Comment createComment (Comment comment);

    /**
     *
     * @return
     */
    public Iterable<Comment> listComments();

    /**
     *
     * @param commentId
     * @return
     */
    public HttpStatus deleteComment(Long commentId);
}
