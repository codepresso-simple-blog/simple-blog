package com.codepresso.blog.repository;

import com.codepresso.blog.vo.UserComment;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;

@Mapper
public interface UserCommentRepository {
    void save(@Param("comment") UserComment userComment);
    List<UserComment> findAll(@Param("postId") Integer postId);
}
