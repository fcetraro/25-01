package controller;

import java.util.Comparator;

public class QuickSortSorterImple implements Sorter{
    private int partition(Object arr[], int begin, int end, Comparator c) {
        Object pivot = arr[end];
        int i = (begin-1);

        for (int j = begin; j < end; j++) {
            if (c.compare(arr[j],pivot) >= 0){
                i++;
                Object swapTemp = arr[i];
                arr[i] = arr[j];
                arr[j] = swapTemp;
            }
        }

        Object swapTemp = arr[i+1];
        arr[i+1] = arr[end];
        arr[end] = swapTemp;

        return i+1;
    }
    public void quickSort(Object arr[], int begin, int end, Comparator c) {
        if (begin < end) {
            int partitionIndex = partition(arr, begin, end, c);

            quickSort(arr, begin, partitionIndex-1, c);
            quickSort(arr, partitionIndex+1, end, c);
        }
    }
    @Override
    public void sort(Object[] arr, Comparator c) {
        quickSort(arr, 0, arr.length-1, c);
    }
}
