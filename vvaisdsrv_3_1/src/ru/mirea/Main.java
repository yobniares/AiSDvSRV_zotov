package ru.mirea;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        System.out.println("Random from Math:");
        ArrayList<Double> fromMath = MyRandom.getList(10, true);
        System.out.println(fromMath);
        System.out.println("Sorted:");
        System.out.println(MySort.mySort(fromMath));

        System.out.println("Random from Math:");
        ArrayList<Double> fromRandom = MyRandom.getList(10, false);
        System.out.println(fromRandom);
        System.out.println("Sorted:");
        System.out.println(MySort.mySort(fromRandom));

    }
}
