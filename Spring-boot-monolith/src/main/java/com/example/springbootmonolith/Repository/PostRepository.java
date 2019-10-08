package com.example.springbootmonolith.Repository;

import com.example.springbootmonolith.model.Post;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PostRepository extends CrudRepository <Post, Long> {

}
