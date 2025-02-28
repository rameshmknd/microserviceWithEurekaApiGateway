
package com.ramesh.comment_service.controller;

import java.time.LocalDateTime;
import java.util.List;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.ramesh.comment_service.model.Comment;

@RestController
public class CommentController {

    private Comment comment = initComment();

    // GET /comments?blogPostId={id} - Retrieves all comments or filters by blog post ID
    @GetMapping("/comments")
    public ResponseEntity<List<Comment>> getComments(@RequestParam(value = "blogPostId", required = false) Long blogPostId) {
        return ResponseEntity.ok(List.of(comment));
    }

    private Comment initComment() {
        Comment cmt = new Comment();
        cmt.setAuthor("John Doe");
        cmt.setBlogPostId(1L);
        cmt.setContent("This is a sample comment.");
        cmt.setCreatedAt(LocalDateTime.now());
        cmt.setId(1L);
        return cmt;
    }

    // POST /comments - Creates a new comment
    @PostMapping("/comments")
    public ResponseEntity<Comment> createComment(@RequestBody Comment comment_) {
        return ResponseEntity.ok(comment);
    }

    // GET /comments/{id} - Retrieves a comment by its ID
    @GetMapping("/comments/{id}")
    public ResponseEntity<Comment> getCommentById(@PathVariable Long id) {
        return ResponseEntity.ok(comment);
    }

    // PUT /comments/{id} - Updates an existing comment
    @PutMapping("/comments/{id}")
    public ResponseEntity<Comment> updateComment(@PathVariable Long id, @RequestBody Comment updatedComment) {
        return ResponseEntity.ok(comment);
    }

    // DELETE /comments/{id} - Deletes a comment by its ID
    @DeleteMapping("/comments/{id}")
    public ResponseEntity<Void> deleteComment(@PathVariable Long id) {
        return ResponseEntity.noContent().build();
    }
}
