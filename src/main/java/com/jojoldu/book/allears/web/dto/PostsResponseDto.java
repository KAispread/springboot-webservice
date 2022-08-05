package com.jojoldu.book.allears.web.dto;

import com.jojoldu.book.allears.domain.posts.Posts;
import lombok.Getter;

@Getter
public class PostsResponseDto {
    private Long id;
    private String title;
    private String content;
    private String author;

    public PostsResponseDto(Posts entity) {
        this.id = entity.getId();
        this.content = entity.getContent();
        this.title = entity.getTitle();
        this.author = entity.getAuthor();
    }
}
