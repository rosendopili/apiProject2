package com.example.apiPROJECT.repository;

import com.example.apiPROJECT.model.Post;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PostRepository extends CrudRepository <Post, Long>  {

    public Post findByPostId(Post id);
}
