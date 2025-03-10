package com.example.basicjpa.controller;

import com.example.basicjpa.dto.PostRequestDto;
import com.example.basicjpa.dto.PostResponseDto;
import com.example.basicjpa.service.PostService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequiredArgsConstructor
public class PostController {

    private final PostService postService;

    @PostMapping("/posts")
    public PostResponseDto save(@RequestBody PostRequestDto dto) {
        return postService.save(dto);
    }

    @GetMapping("/posts")
    public List<PostResponseDto> findAll() {
        return postService.findAll();
    }
}
