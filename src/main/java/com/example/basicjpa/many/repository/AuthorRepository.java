package com.example.basicjpa.many.repository;

import com.example.basicjpa.many.entity.Author;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AuthorRepository extends JpaRepository<Author, Long> {
}
