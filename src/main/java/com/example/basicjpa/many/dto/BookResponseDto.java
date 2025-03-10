package com.example.basicjpa.many.dto;

import lombok.Getter;

@Getter
public class BookResponseDto {
    private final Long id;
    private final String title;

    public BookResponseDto(Long id, String title) {
        this.id = id;
        this.title = title;
    }
}
