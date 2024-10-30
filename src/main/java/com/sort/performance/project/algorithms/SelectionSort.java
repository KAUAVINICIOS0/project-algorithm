package com.sort.performance.project.algorithms;
import java.util.List;

import org.springframework.stereotype.Component;

@Component
public class SelectionSort {
  
    public static List<Integer> selectionSort(List<Integer> data) {
        int n = data.size();

        // Um por um, move a fronteira do array não ordenado
        for (int i = 0; i < n - 1; i++) {
            // Encontra o menor elemento na dataa não ordenada
            int minIndex = i;
            for (int j = i + 1; j < n; j++) {
                if (data.get(j) < data.get(minIndex)) {
                    minIndex = j;
                }
            }

            // Troca o menor elemento encontrado com o primeiro elemento da dataa não ordenada
            if (minIndex != i) {
                // Troca os elementos
                Integer temp = data.get(minIndex);
                data.set(minIndex, data.get(i));
                data.set(i, temp);
            }
        }
        return data;
    }
}
