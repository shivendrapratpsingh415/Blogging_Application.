package com.codewithshivendra.blog.services;

import com.codewithshivendra.blog.payloads.CommentDto;

public interface CommentService {

	CommentDto createComment(CommentDto commentDto, Integer postId);

	void deleteComment(Integer commentId);


}
