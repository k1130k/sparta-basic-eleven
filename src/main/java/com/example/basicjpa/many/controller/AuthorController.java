package com.example.basicjpa.many.controller;

import com.example.basicjpa.many.dto.AuthorRequestDto;
import com.example.basicjpa.many.dto.AuthorResponseDto;
import com.example.basicjpa.many.service.AuthorService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
public class AuthorController {

    private final AuthorController authorController;
    private final AuthorService authorService;

    @PostMapping("/authors")
    public ResponseEntity<AuthorResponseDto> save(@RequestBody AuthorRequestDto dto) {
        return ResponseEntity.ok(authorService.save(dto));
    }
}
