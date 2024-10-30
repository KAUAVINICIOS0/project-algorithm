package com.sort.performance.project.algorithms;

import java.util.Collections;
import java.util.List;

import org.springframework.stereotype.Component;

@Component
public class BubbleSort {
    
    public List<Integer> sort(List<Integer> data) {
        int n = data.size();
        for (int i = 0; i < n - 1; i++) {
            boolean swapped = false;
            for (int j = 0; j < n - i - 1; j++) {
                if (data.get(j) > data.get(j + 1)) {
                    Collections.swap(data, j, j + 1); 
                    swapped = true;
                }
            }
            if (!swapped) break; 
        }
        return data;
    }
}
