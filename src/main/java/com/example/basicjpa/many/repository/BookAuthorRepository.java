package com.example.basicjpa.many.repository;

import com.example.basicjpa.many.entity.BookAuthor;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BookAuthorRepository extends JpaRepository<BookAuthor, Long> {
}
