package ru.mirea;

import java.util.ArrayList;

public class MySort {

    public static ArrayList<Double> mySort(ArrayList<Double> data) {
        // Сортировка вставками / Insertion sort

        int i, j;
        double key;
        for (i = 1; i < data.size(); ++i) {
            j = i - 1;
            key = data.get(i);
            while ((j >= 0) && (data.get(j) > key)) {
                data.set(j + 1, data.get(j));
                j -= 1;
            }
            data.set(j + 1, key);
        }
        return data;
    }
}
