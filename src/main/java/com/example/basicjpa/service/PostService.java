package com.example.basicjpa.service;

import com.example.basicjpa.dto.PostRequestDto;
import com.example.basicjpa.dto.PostResponseDto;
import com.example.basicjpa.entity.Post;
import com.example.basicjpa.repository.PostRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.ArrayList;
import java.util.List;

@Service
@RequiredArgsConstructor
public class PostService {

    private final PostRepository postRepository;

    @Transactional
    public PostResponseDto save(PostRequestDto dto) {
        Post post = new Post(dto.getTitle());
        Post savedPost = postRepository.save(post);
        return new PostResponseDto(savedPost.getId(), savedPost.getTitle());
    }
    @Transactional(readOnly = true)
    public List<PostResponseDto> findAll() {
        List<Post> posts = postRepository.findAll();

        List<PostResponseDto> dtos = new ArrayList<>();
        for (Post post : posts) {
            dtos.add(new PostResponseDto(post.getId(), post.getTitle()));
        }
        return dtos;
    }
}
