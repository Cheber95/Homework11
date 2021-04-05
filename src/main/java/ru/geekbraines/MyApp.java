package ru.geekbraines;

import com.sun.org.apache.xpath.internal.operations.Or;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MyApp {

    public static void main(String[] args) {
        Integer[] myArrInt = new Integer[] {0,1,2,3,4};
        Double[] myArrDouble = new Double[] {0.0,1.0,2.2,3.6,4.4};

        MyGeneric<Integer> genInt = new MyGeneric<>();
        MyGeneric<Double> genDouble = new MyGeneric<>();

        myArrInt = genInt.changeArray(myArrInt, 2,4);
        myArrDouble = genDouble.changeArray(myArrDouble,0,2);
        System.out.println("целочисленный массив\n" + Arrays.toString(myArrInt));
        System.out.println("вещественный массив\n" + Arrays.toString(myArrDouble));

        ArrayList<Integer> myArrIntToList = genInt.toArrayList(myArrInt);
        System.out.println("целочисленный массив\n" + myArrIntToList.toString());
        ArrayList<Double> myArrDToList = genDouble.toArrayList(myArrDouble);
        System.out.println("вещественный массив\n" + myArrDToList.toString());

        Box<Apple> appleBox = new Box<>();
        Box<Orange> orangeBox = new Box<>();
        Apple apple = new Apple();
        Orange orange = new Orange();
        for (int i = 0; i < 13; i++) {
            appleBox.addFruit(apple);
        }
        for (int i = 0; i < 8; i++) {
            orangeBox.addFruit(orange);
        }

        System.out.println(orangeBox.getWeight());
        System.out.println(appleBox.getWeight());

        if (orangeBox.compare(appleBox)) {
            System.out.println("Коробки равны по весу");
        } else {
            System.out.println("Коробки не равны по весу");
        }

        Box<Orange> orangeBox1 = new Box<>();
        for (int i = 0; i < 6; i++) {
            orangeBox.addFruit(orange);
        }
        orangeBox.addToOtherBox(orangeBox1);
        System.out.println(orangeBox.getWeight());
        System.out.println(orangeBox1.getWeight());
    }
}
