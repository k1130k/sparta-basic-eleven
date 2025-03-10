package com.example.basicjpa.repository;

import com.example.basicjpa.entity.Post;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PostRepository extends JpaRepository<Post, Long> {
}
