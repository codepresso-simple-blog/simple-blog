package com.codepresso.blog.controller;

import com.codepresso.blog.service.PostService;
import com.codepresso.blog.vo.Post;
import com.codepresso.blog.vo.Result;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class PostController {

    private PostService postService;

    public PostController(PostService postService) {
        this.postService = postService;
    }

    @GetMapping("/posts")
    public List<Post> getPostList() {
        return postService.getPostList();
    }

    @GetMapping("/post")
    public Post getPost(@RequestParam("id") Integer id) {
        return postService.getPostById(id);
    }

    @PostMapping("/post")
    public Result addPost(@RequestBody Post post) {
        postService.addPost(post);
        return new Result(200, "Success");
    }

    @PutMapping("/post")
    public Result updatePost(@RequestBody Post post) {
        postService.updatePost(post);
        return new Result(200, "Success");
    }

    @DeleteMapping("/post")
    public Result deletePost(@RequestParam("id") Integer id) {
        postService.deletePost(id);
        return new Result(200, "Success");
    }
}
