package com.example.springbootmonolith.Service;

import com.example.springbootmonolith.Repository.CommentRepository;
import com.example.springbootmonolith.model.Comment;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;


@Service
public class CommentServiceImpl implements CommentService {

    @Autowired
    CommentRepository commentRepository;

    /**
     *
     * @param comment
     * @return saved comment.
     */
    @Override
    public Comment createComment(Comment comment) {
        return commentRepository.save(comment);
    }

    /**
     *
     * @return comments as list.
     */
    @Override
    public Iterable<Comment> listComments(){
        return commentRepository.findAll();
    }

    /**
     *
     * @param commentId
     * @return httpStatus OK if comment delete successful.
     */
    @Override
    public HttpStatus deleteComment(Long commentId){
        commentRepository.deleteById(commentId);

        return HttpStatus.OK;
    }

}
