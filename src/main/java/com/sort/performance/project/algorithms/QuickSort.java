package com.sort.performance.project.algorithms;

import java.util.Collections;
import java.util.List;

import org.springframework.stereotype.Component;
@Component
public class QuickSort {

    public static List<Integer> sort(List<Integer> data, int begin, int end) {
        if (begin < end) {
            int partitionIndex = partition(data, begin, end);

            // Recursão para as duas metades
            sort(data, begin, partitionIndex - 1);
            sort(data, partitionIndex + 1, end);
        }
        return data;
    }

    private static int partition(List<Integer> data, int begin, int end) {
        int pivot = data.get(end);
        int i = begin - 1;

        for (int j = begin; j < end; j++) {
            if (data.get(j) <= pivot) {
                i++;
                // Troca os elementos data[i] e data[j]
                Collections.swap(data, i, j);
            }
        }

        // Coloca o pivô no lugar correto
        Collections.swap(data, i + 1, end);
        return i + 1;
    }
}
