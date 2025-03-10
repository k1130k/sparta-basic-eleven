package com.example.basicjpa.controller;

import com.example.basicjpa.dto.CommentRequestDto;
import com.example.basicjpa.dto.CommentResponseDto;
import com.example.basicjpa.service.CommentService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequiredArgsConstructor
public class CommentController {

    private final CommentService commentService;

    @PostMapping("/comments")
    public CommentResponseDto save(@RequestBody CommentRequestDto dto) {
        return commentService.save(dto);
    }

    @GetMapping("/comments")
    public List<CommentResponseDto> findAll() {
        return commentService.findAll();
    }
}
