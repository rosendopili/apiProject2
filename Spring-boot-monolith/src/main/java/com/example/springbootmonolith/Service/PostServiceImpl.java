package com.example.springbootmonolith.Service;

import com.example.springbootmonolith.Repository.PostRepository;
import com.example.springbootmonolith.model.Post;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;

@Service
public class PostServiceImpl implements PostService {

    @Autowired
    PostRepository postRepository;

    /**
     *
     * @param post
     * @return saved post.
     */
    @Override
    public Post createPost(Post post) {
        return postRepository.save(post);
    }

    /**
     *
     * @return list of all posts.
     */
    @Override
    public Iterable<Post> listPosts() {
        return postRepository.findAll();
    }

    /**
     *
     * @param postId
     * @return httpstatus ok if delete post successful.
     */
    @Override
    //consider returning as void//
    public HttpStatus deletePost(Long postId) {
        postRepository.deleteById(postId);
        return HttpStatus.OK;
    }

}

