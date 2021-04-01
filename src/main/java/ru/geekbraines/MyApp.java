package ru.geekbraines;

import java.util.ArrayList;
import java.util.Arrays;

public class MyApp {

    public static void main(String[] args) {
        Integer[] myArrInt = new Integer[] {0,1,2,3,4};
        Double[] myArrDouble = new Double[] {0.0,1.0,2.2,3.6,4.4};

        MyGeneric<Integer> genInt= new MyGeneric<>();
        MyGeneric<Double> genDouble = new MyGeneric<>();
        myArrInt = genInt.changeArray(myArrInt,2,4);
        myArrDouble = genDouble.changeArray(myArrDouble,0,2);
        System.out.println("целочисленный массив");
        for (int i = 0; i < myArrInt.length; i++) {
            System.out.print(myArrInt[i] + " ");
        }
        System.out.println("\nвещественный массив");
        for (int i = 0; i < myArrDouble.length; i++) {
            System.out.print(myArrDouble[i] + " ");
        }
        ArrayList<Integer> myArrIntToArrayList = new ArrayList<>();
        myArrIntToArrayList = genInt.toArrayList(myArrInt);
    }
}
