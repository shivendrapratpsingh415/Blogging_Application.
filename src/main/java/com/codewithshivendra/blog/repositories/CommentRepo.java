package com.codewithshivendra.blog.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.codewithshivendra.blog.entities.Comment;

public interface CommentRepo  extends JpaRepository<Comment	, Integer> {

}
