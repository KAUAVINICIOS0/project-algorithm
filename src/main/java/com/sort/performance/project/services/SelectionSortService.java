package com.sort.performance.project.services;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sort.performance.project.algorithms.SelectionSort;

@Service
public class SelectionSortService {

    private final SelectionSort selectionSort;

    @Autowired
    public SelectionSortService(SelectionSort _selectionSort){
        this.selectionSort = _selectionSort;
    }

    public List<Integer> sort(List<Integer> data){
        return selectionSort.sort(data);
    }
}
