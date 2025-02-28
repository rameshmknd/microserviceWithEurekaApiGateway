
package com.ramesh.analytics_service.controller;

import java.util.HashMap;
import java.util.Map;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class AnalyticsController {

    /**
     * Endpoint to retrieve various metrics.
     * 
     * @return ResponseEntity containing a map of metrics.
     */
    @GetMapping("/metrics")
    public ResponseEntity<Map<String, Object>> getMetrics() {
        // Create a map to hold the metrics
        Map<String, Object> metrics = new HashMap<>();
        // Add sample metrics to the map
        metrics.put("totalPosts", 150);
        metrics.put("totalComments", 500);
        metrics.put("uniqueVisitors", 120);
        metrics.put("averageTimeOnSite", "5 minutes");
        metrics.put("bounceRate", "40%");
        // Return the metrics wrapped in a ResponseEntity
        return ResponseEntity.ok(metrics);
    }

    /**
     * Endpoint to retrieve a summary of the system status.
     * 
     * @return ResponseEntity containing a map of summary information.
     */
    @GetMapping("/summary")
    public ResponseEntity<Map<String, Object>> getSummary() {
        // Create a map to hold the summary information
        Map<String, Object> summary = new HashMap<>();
        // Add sample summary information to the map
        summary.put("uptime", "30 days");
        summary.put("status", "healthy");
        summary.put("totalUsers", 200);
        summary.put("activeUsers", 180);
        // Return the summary wrapped in a ResponseEntity
        return ResponseEntity.ok(summary);
    }
}
