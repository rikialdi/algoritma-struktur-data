package algoritma.pertemuan9_10;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class ShortingMethod {
    public static void main(String[] args) {
//        arrayUrutMenaik();
//        arrayUrutMenurun();
//        arrayurutMenurunString();
        arrayurutMenaikString();
    }

    public static void arrayUrutMenaik() {
        //defining an array of integer type
        int[] array = new int[]{90, 23, 5, 109, 12, 22, 67, 34};
//invoking sort() method of the Arrays class
        Arrays.sort(array);
        System.out.println("Elements of array sorted in ascending order: ");
//prints array using the for loop
        for (int i = 0; i < array.length; i++) {
            System.out.println(array[i]);
        }

    }

    public static void arrayUrutMenurun(){
        Integer [] array = {23, -9, 78, 102, 4, 0, -1, 11, 6, 110, 205};
// sorts array[] in descending order
        Arrays.sort(array, Collections.reverseOrder());
        System.out.println("Array elements in descending order: " +Arrays.toString(array));
    }

    public static void arrayurutMenurunString(){
        String [] strarray = {"Mango", "Apple", "Grapes", "Papaya", "Pineapple", "Banana", "Orange"};
// sorts array[] in descending order
        Arrays.sort(strarray, Collections.reverseOrder());
        System.out.println("Array elements in descending order: " +Arrays.toString(strarray));
    }

    public static void arrayurutMenaikString(){
        String [] strarray = {"Mango", "Apple", "Grapes", "Papaya", "Pineapple", "Banana", "Orange"};
// sorts array[] in descending order
        Arrays.sort(strarray);
        System.out.println("Array elements in descending order: " +Arrays.toString(strarray));
    }
}
