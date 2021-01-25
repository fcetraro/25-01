package controller;

import util.SortUtil;

public class Main {
    public static void main(String[] args)
    {
        exercise1();
    }
    private static void exercise1(){
        Persona p0 = new Persona("Federico Cetraro", 123);
        Persona p1 = new Persona("Carlos Patricio", 121);
        Persona p2 = new Persona("Tomas Merencio", 321);
        Persona p3 = new Persona("Pablo", 503);
        Persona[] toSort = new Persona[4];
        toSort[0]=p0;
        toSort[1]=p1;
        toSort[2]=p2;
        toSort[3]=p3;
        System.out.println("BEFORE SORT");
        printArray(toSort);
        System.out.println("SORTED");
        printArray(SortUtil.ordenarT(toSort));
    }
    private static void printArray(Object[] array){
        for (int i = 0; i < array.length; i++) {
            System.out.println(array[i].toString());
        }
    }
}
