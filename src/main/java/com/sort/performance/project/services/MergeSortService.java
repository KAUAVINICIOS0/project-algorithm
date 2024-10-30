package com.sort.performance.project.services;

import java.util.List;

import org.springframework.stereotype.Service;

import com.sort.performance.project.algorithms.MergeSort;

@Service
public class MergeSortService {
    private final MergeSort mergeSort;

    public MergeSortService(MergeSort _mergeSort){
        this.mergeSort = _mergeSort;
    }

    public List<Integer> mergeSort(List<Integer> data) {
        return mergeSort.sort(data, data.size());
    }

}
