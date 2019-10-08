package com.example.springbootmonolith.Service;

import com.example.springbootmonolith.Model.Comment;

public interface CommentService {

    public Comment createComment (Comment comment);

    public Iterable<Comment> listComments();

    public Comment deleteComment(Comment comment);
}
