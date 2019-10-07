package com.example.apiPROJECT.repository;

import com.example.apiPROJECT.model.Comment;
import org.springframework.data.repository.CrudRepository;

public interface CommentRepository extends CrudRepository <Comment, Long>  {

    public Comment findByCommentId(Comment id);
}
