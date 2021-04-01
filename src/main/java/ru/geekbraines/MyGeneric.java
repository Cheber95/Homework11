package ru.geekbraines;

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
        List<T> myArrayList;
        myArrayList = Arrays.asList(myArray);
        return myArrayList;
    }

}
