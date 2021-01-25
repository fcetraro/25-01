package controller;

import java.util.Comparator;

public class BubbleSortSorterImple implements Sorter{
    @Override
    public void sort(Object[] arr, Comparator c) {
        int i, j;
        Object aux;
        for (i = 0; i < arr.length - 1; i++) {
            for (j = 0; j < arr.length - i - 1; j++) {
                if (c.compare(arr[j + 1],(arr[j])) == 1) {
                    aux = arr[j + 1];
                    arr[j + 1] = arr[j];
                    arr[j] = aux;
                }
            }
        }
    }
}
