package com.ramesh.blog_service.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.ramesh.blog_service.model.BlogPost;
import com.ramesh.blog_service.service.CommentService;

@RestController
public class BlogController {

	@Autowired
	CommentService commentService;

	// Retrieve all blog posts

	// Create a new blog post
	@PostMapping("/posts")
	public ResponseEntity<BlogPost> createPost(@RequestBody BlogPost post) {
		// BlogPost savedPost = blogPostRepository.save(post);
		return ResponseEntity.ok(new BlogPost());
	}

	// Retrieve a blog post by ID
	@GetMapping("/posts/{id}")
	public ResponseEntity<BlogPost> getPostById(@PathVariable Long id) {
		return ResponseEntity.ok(new BlogPost());
	}

	// Update an existing blog post
	@PutMapping("/posts/{id}")
	public ResponseEntity<BlogPost> updatePost(@PathVariable Long id, @RequestBody BlogPost updatedPost) {
		return ResponseEntity.ok(new BlogPost());
	}

	// Delete a blog post
	@DeleteMapping("/posts/{id}")
	public ResponseEntity<Void> deletePost(@PathVariable Long id) {
		return null;
	}

	@PostMapping("/post/comments")
	public ResponseEntity<String> getComments() {
		return ResponseEntity.ok(commentService.fetchComments());

	}
}