package com.example.apiPROJECT.repository;

import com.example.apiPROJECT.model.Post;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PostInterface extends CrudRepository <Post, Long>  {

    public Post findByPostId(Post id);
}
