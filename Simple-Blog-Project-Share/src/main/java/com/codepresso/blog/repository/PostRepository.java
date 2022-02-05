package com.codepresso.blog.repository;

import com.codepresso.blog.vo.Post;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;

@Mapper
public interface PostRepository {
    void save(@Param("post") Post post);
    List<Post> findAll();
    Post findById(@Param("id") Integer id);
    void updatePost(@Param("post") Post post);
    void deleteById(@Param("id") Integer id);
}
