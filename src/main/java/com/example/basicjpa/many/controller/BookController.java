package com.example.basicjpa.many.controller;

import com.example.basicjpa.many.dto.BookRequestDto;
import com.example.basicjpa.many.dto.BookResponseDto;
import com.example.basicjpa.many.service.BookService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
public class BookController {

    private final BookService bookService;

    @PostMapping("/books")
    public BookResponseDto save(@RequestBody BookRequestDto dto) {
        return bookService.save(dto);
    }
}
