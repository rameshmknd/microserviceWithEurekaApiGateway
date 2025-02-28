package com.ramesh.blog_service.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.web.client.RestTemplate;

@Component
public class CommentService {
	
	@Autowired
	private RestTemplate restTemplate;
	
	
    
    public String fetchComments() {
        // Using the service ID "comment-service" which Eureka will resolve.
        String url = "http://comment-service/1";
        String response = restTemplate.getForObject(url, String.class);
        return response;
    }
}
