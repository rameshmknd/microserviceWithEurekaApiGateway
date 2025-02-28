package com.ramesh.comment_service.model;


import java.time.LocalDateTime;


public class Comment {

    private Long id;

    // The blog post ID this comment belongs to
    private Long blogPostId;
    private String author;
    private String content;
    private LocalDateTime createdAt;

    public Comment() {
    }

    public Comment(Long blogPostId, String author, String content, LocalDateTime createdAt) {
        this.blogPostId = blogPostId;
        this.author = author;
        this.content = content;
        this.createdAt = createdAt;
    }

    // Getters and Setters

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getBlogPostId() {
        return blogPostId;
    }

    public void setBlogPostId(Long blogPostId) {
        this.blogPostId = blogPostId;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public LocalDateTime getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(LocalDateTime createdAt) {
        this.createdAt = createdAt;
    }
}

