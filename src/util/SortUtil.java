package util;

import controller.Precedable;

public class SortUtil {
    public static Precedable[] ordenar(Precedable arr[]){
        int i, j;
        Precedable aux;
        for (i = 0; i < arr.length - 1; i++) {
            for (j = 0; j < arr.length - i - 1; j++) {
                if (arr[j + 1].precedeA(arr[j]) == 1) {
                    aux = arr[j + 1];
                    arr[j + 1] = arr[j];
                    arr[j] = aux;
                }
            }
        }
        return arr;
    }
    public static <T> Precedable[] ordenarT(Precedable<T> arr[]){
        int i, j;
        Precedable aux;
        for (i = 0; i < arr.length - 1; i++) {
            for (j = 0; j < arr.length - i - 1; j++) {
                if (arr[j + 1].precedeA((T)arr[j]) == 1) {
                    aux = arr[j + 1];
                    arr[j + 1] = arr[j];
                    arr[j] = aux;
                }
            }
        }
        return arr;
    }
}
