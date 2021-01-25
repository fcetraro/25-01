package controller;

public class MiFactory {
    public static Sorter getInstance(){
        return new BubbleSortSorterImple();
    }
}
