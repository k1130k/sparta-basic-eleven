package com.example.basicjpa.many.repository;

import com.example.basicjpa.many.entity.Book;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BookRepository extends JpaRepository<Book, Long> {
}
