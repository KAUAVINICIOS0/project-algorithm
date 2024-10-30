package com.sort.performance.project.controllers;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.sort.performance.project.services.BubbleSortService;

@RestController
@RequestMapping("/api/bubblesort")
public class BubbleSortController {

    private final BubbleSortService bubbleSortService;

    @Autowired
    public BubbleSortController(BubbleSortService _bubbleSortService) {
        this.bubbleSortService = _bubbleSortService;
    }

    @GetMapping("/sort")
    public ResponseEntity<Map<String, Object>> getData() {
        final int hectares = 20000;
        List<Integer> data = new ArrayList<>();
        for (int i = 0; i < hectares; i++) {
            data.add((int)(Math.random() * 100000)); 
        }

        long startTime = System.currentTimeMillis();
        bubbleSortService.bubbleSortMethod(data);
        long endTime = System.currentTimeMillis();

        long sortTime = endTime - startTime;

        Map<String, Object> response = new HashMap<>();
        response.put("sortTime", sortTime);

        return ResponseEntity.ok(response);
    }       
}
