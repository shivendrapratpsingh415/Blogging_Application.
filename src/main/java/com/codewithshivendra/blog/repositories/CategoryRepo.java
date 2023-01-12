package com.codewithshivendra.blog.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.codewithshivendra.blog.entities.Category;

public interface CategoryRepo extends JpaRepository<Category, Integer> {

}
