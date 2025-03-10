package com.example.basicjpa.many.service;

import com.example.basicjpa.many.dto.BookRequestDto;
import com.example.basicjpa.many.dto.BookResponseDto;
import com.example.basicjpa.many.entity.Book;
import com.example.basicjpa.many.repository.BookRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@RequiredArgsConstructor
public class BookService {

    private final BookRepository bookRepository;

    @Transactional
    public BookResponseDto save(BookRequestDto dto) {
        Book book = new Book(dto.getTitle());
        Book savedBook = bookRepository.save(book);
        return new BookResponseDto(savedBook.getId(), savedBook.getTitle());
    }
}
