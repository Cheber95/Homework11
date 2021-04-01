package ru.geekbraines;

public class MyGeneric<T extends Number> {
    private T[] myArray;

    public MyGeneric(T[] myArray) {
        this.myArray = myArray;
    }

    public void setMyArray(T[] myArray) {
        this.myArray = myArray;
    }

    public T[] getMyArray() {
        return myArray;
    }

    public void setMyArrayEl(int index, T value) {
        this.myArray[index] = value;
    }

    public T getMyArrayEl(int index) {
        return myArray[index];
    }


}
