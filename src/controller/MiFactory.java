package controller;

import java.io.File;
import java.util.Scanner;

public class MiFactory {
    public static Sorter getInstance(){
        File file = new File("src/MiFactory.propierties");
        try{
            Scanner sc = new Scanner(file);
            sc.useDelimiter("\\Z");
            String[] array = sc.next().split("\\.", 0);
            Class reflectionClass = Class.forName("controller."+array[1]);
            Object obj = reflectionClass.getDeclaredConstructor().newInstance();
            return (Sorter) obj;
        } catch (Exception e){
            e.printStackTrace();
            return new HeapSortSorterImple();
        }
    }
}
