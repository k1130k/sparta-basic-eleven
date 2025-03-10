package com.example.basicjpa.dto;

import lombok.Getter;

@Getter
public class CommentRequestDto  {

    private String content;
    private Long postId;
}
