package com.ramesh.api_gateway;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.gateway.route.RouteLocator;
import org.springframework.cloud.gateway.route.builder.RouteLocatorBuilder;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class ApiGatewayApplication {

	public static void main(String[] args) {
		SpringApplication.run(ApiGatewayApplication.class, args);
	}

	@Bean
    public RouteLocator gatewayRoutes(RouteLocatorBuilder builder) {
        return builder.routes()
            // Route for Blog Service: routes paths starting with /blog to blog-service
            .route("blog_route", r -> r.path("/blog/**")
                .filters(f -> f.rewritePath("/blog/(?<segment>.*)", "/${segment}"))
                .uri("http://localhost:8080"))
            
            // Route for Comment Service: routes paths starting with /comment to comment-service
            .route("comment_route", r -> r.path("/comment/**")
                .filters(f -> f.rewritePath("/comment/(?<segment>.*)", "/${segment}"))
                .uri("http://localhost:8081"))
            
            // Route for Analytics Service: routes paths starting with /analytics to analytics-service
            .route("analytics_route", r -> r.path("/analytics/**")
                .filters(f -> f.rewritePath("/analytics/(?<segment>.*)", "/${segment}"))
                .uri("http://localhost:8082"))
            
            .build();
    }
}