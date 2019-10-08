package com.example.springbootmonolith.Service;

import com.example.springbootmonolith.Repository.PostRepository;
import com.example.springbootmonolith.Model.Post;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class PostServiceImpl implements PostService{

    @Autowired
    PostRepository postRepository;

    @Override
    public Post createPost(Post post){ return postRepository.save(post);}

    @Override
    public Iterable<Post> listPosts(){
        return postRepository.findAll();
    }


}
