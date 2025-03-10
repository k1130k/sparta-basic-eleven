package com.example.basicjpa.many.service;

import com.example.basicjpa.many.dto.AuthorRequestDto;
import com.example.basicjpa.many.dto.AuthorResponseDto;
import com.example.basicjpa.many.entity.Author;
import com.example.basicjpa.many.repository.AuthorRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@RequiredArgsConstructor
public class AuthorService {

    private final AuthorRepository authorRepository;

    @Transactional
    public AuthorResponseDto save(AuthorRequestDto dto) {
        Author author = new Author(dto.getName());

        Author savedAuthor = authorRepository.save(author);
        return new AuthorResponseDto(savedAuthor.getId(), savedAuthor.getName());
    }
}
