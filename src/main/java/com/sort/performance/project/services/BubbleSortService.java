package com.sort.performance.project.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sort.performance.project.algorithms.BubbleSort;

@Service
public class BubbleSortService {
    private final BubbleSort bubbleSort;

    @Autowired
    public BubbleSortService(BubbleSort _bubbleSort) {
        this.bubbleSort = _bubbleSort;
    }

    public List<Integer> bubbleSortMethod(List<Integer> data) {
        return bubbleSort.sort(data); 
    }
}
