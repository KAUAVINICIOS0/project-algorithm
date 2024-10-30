package com.sort.performance.project.algorithms;
import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Component;

@Component
public class MergeSort {

    public static List<Integer> sort(List<Integer> data, int n) {
        if (n < 2) {
            return data;
        }
        int mid = n / 2;
        List<Integer> Left = new ArrayList<>(mid);
        List<Integer> Right = new ArrayList<>(n - mid);


        for (int i = 0; i < mid; i++) {
            Left.add(data.get(i));
        }
        for (int i = mid; i < n; i++) {
            Right.add(data.get(i));
        }

        sort(Left, mid);
        sort(Right, n - mid);

        merge(data, Left, Right, mid, n - mid);
        return data;
    }


    public static List<Integer> merge(List<Integer> data, List<Integer> L, List<Integer> R, int left, int right) {
        int i = 0, j = 0, k = 0;

        while (i < left && j < right) {
            if (L.get(i) <= R.get(j)) {
                data.set(k++, L.get(i++));
            } else {
                data.set(k++, R.get(j++));
            }
        }
        while (i < left) {
            data.set(k++, L.get(i++));
        }
        while (j < right) {
            data.set(k++, R.get(j++));
        }
        return data;
    }
}
