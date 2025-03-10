package com.example.basicjpa.service;

import com.example.basicjpa.dto.CommentRequestDto;
import com.example.basicjpa.dto.CommentResponseDto;
import com.example.basicjpa.entity.Comment;
import com.example.basicjpa.entity.Post;
import com.example.basicjpa.repository.CommentRepository;
import com.example.basicjpa.repository.PostRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.ArrayList;
import java.util.List;

@Service
@RequiredArgsConstructor
public class CommentService {
    private final CommentRepository commentRepository;
    private final PostRepository postRepository;

    @Transactional
    public CommentResponseDto save(CommentRequestDto dto) {

        Post post = postRepository.findById(dto.getPostId()).orElseThrow(
                () -> new IllegalStateException("존재하지 않는 post입니다.")
        );

        Comment comment = new Comment(dto.getContent(), post);
        Comment savedComment = commentRepository.save(comment);
        return new CommentResponseDto(savedComment.getId(), savedComment.getContent());
    }

    @Transactional(readOnly = true)
    public List<CommentResponseDto> findAll() {
        List<Comment> comments = commentRepository.findAll();

        List<CommentResponseDto> dtos = new ArrayList<>();
        for (Comment comment : comments) {
            dtos.add(new CommentResponseDto(comment.getId(), comment.getContent()));
        }
        return dtos;
    }
}
