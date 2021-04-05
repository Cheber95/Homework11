package ru.geekbraines;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MyGeneric<T extends Number> {
    //private T[] myArray;


    public MyGeneric() {

    }

    public T[] changeArray(T[] inArray, int i1, int i2)  {
        T tmp;
        tmp = inArray[i1];
        inArray[i1] = inArray[i2];
        inArray[i2] = tmp;

        return inArray;
    }

    public ArrayList<T> toArrayList(T[] myArray) {
        ArrayList<T> myArrayList = new ArrayList<>(myArray.length);
        boolean b;
        for (T t : myArray) {
            b = myArrayList.add(t);
        }
        return myArrayList;
    }
}
