package ru.mirea;

import java.util.ArrayList;
import java.util.Random;

public class MyRandom {
    public static double fromMath() {
        return Math.random();
    }

    public static double fromRandom() {
        return new Random().nextDouble();
    }

    public static ArrayList<Double> getList(int len, boolean isFromMath) {
        ArrayList<Double> result = new ArrayList<Double>();
        for (int i = 0; i < len; i++) {
            try {
                if (isFromMath)
                    result.add(fromMath());
                else
                    result.add(fromRandom());
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
        return result;
    }
}
