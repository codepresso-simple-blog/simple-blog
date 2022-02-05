package com.codepresso.blog.service;

import com.codepresso.blog.repository.PostRepository;
import com.codepresso.blog.vo.Post;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PostService {

    private PostRepository postRepository;

    public PostService(PostRepository postRepository) {
        this.postRepository = postRepository;
    }

    public List<Post> getPostList() {
        return postRepository.findAll();
    }

    public Post getPostById(int id) {
        Post post = postRepository.findById(id);
        return post;
    }

    public void addPost(Post post) {
        postRepository.save(post);
    }

    public void updatePost(Post post) {
        postRepository.updatePost(post);
    }

    public void deletePost(int id) {
        postRepository.deleteById(id);
    }
}
