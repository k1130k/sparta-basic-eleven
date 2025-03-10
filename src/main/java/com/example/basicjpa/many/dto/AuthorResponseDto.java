package com.example.basicjpa.many.dto;

import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.Getter;

@Getter
public class AuthorResponseDto {
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private final Long id;
    private final String name;

    public AuthorResponseDto(Long id, String name) {
        this.id = id;
        this.name = name;
    }
}
