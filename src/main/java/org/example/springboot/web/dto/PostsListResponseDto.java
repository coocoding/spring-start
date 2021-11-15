package org.example.springboot.web.dto;

import org.example.springboot.domain.Posts.Posts;

import java.time.LocalDateTime;

public class PostsListResponseDto {
    private Long id;
    private String title;
    private String author;
    private LocalDateTime modifiedDate;

    public PostsListResponseDto(Posts entity){
        this.id=entity.getId();
        this.title= entity.getTitle();
        this.author= entity.getAuthor();
        this.modifiedDate=entity.getModifiedDate();
 }
}
