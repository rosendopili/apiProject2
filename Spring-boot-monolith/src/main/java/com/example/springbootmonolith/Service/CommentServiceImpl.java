package com.example.springbootmonolith.Service;

import com.example.springbootmonolith.Repository.CommentRepository;
import com.example.springbootmonolith.Repository.PostRepository;
import com.example.springbootmonolith.Repository.UserRepository;
import com.example.springbootmonolith.model.Comment;
import com.example.springbootmonolith.model.Post;
import com.example.springbootmonolith.model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;


@Service
public class CommentServiceImpl implements CommentService {

    @Autowired
    CommentRepository commentRepository;

    @Autowired
    PostRepository postRepository;
    /**
     *
     * @param newComment
     * @param postId
     * @return
     */
    @Override
    public Comment createComment(Comment newComment, long postId) {
        Post newPost = postRepository.findById(postId).get();
        newComment.setPost(newPost);

        return commentRepository.save(newComment);
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
    public HttpStatus deleteComment(long commentId){
        commentRepository.deleteById(commentId);

        return HttpStatus.OK;
    }

}
