package com.example.basicjpa.dto;

import lombok.Getter;

@Getter
public class CommentResponseDto {

    private final Long id;
    private final String contnet;

    public CommentResponseDto(Long id, String contnet) {
        this.id = id;
        this.contnet = contnet;
    }
}
