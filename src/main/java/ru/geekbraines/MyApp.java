package ru.geekbraines;

public class MyApp<T extends Number> {
    public static void main(String[] args) {
        Integer[] myArrInt = new Integer[] {0,1,2,3,4};
        Double[] myArrDouble = new Double[] {0.0,1.0,2.2,3.6,4.4};
        MyApp<?> genInt = new MyApp<>();

        genInt.change(myArrInt, 1,2);
        for (int i = 0; i < myArrInt.length; i++) {
            System.out.println(myArrInt[i]);
        }
        for (int i = 0; i < myArrDouble.length; i++) {
            System.out.println(myArrDouble[i]);
        }
    }

    private void change(T[] array, int index1, int index2) {
        T tmp;
        tmp = array[index1];
        array[index1] = array[index2];
        array[index2] = tmp;
    }
}
