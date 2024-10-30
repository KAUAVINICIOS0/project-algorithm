package com.sort.performance.project.services;

import java.util.List;

import org.springframework.stereotype.Service;

import com.sort.performance.project.algorithms.QuickSort;

@Service
public class QuickSortService {

    private final QuickSort quicksort;

    public QuickSortService(QuickSort _quicksort) {
        this.quicksort = _quicksort; 
    }

    public List<Integer> quickSort(List<Integer> data) {
        return quicksort.sort(data, 0, data.size() - 1);
        
    }
}

