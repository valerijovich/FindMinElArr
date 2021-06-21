package com.company.valerijovich;

import java.util.Arrays;
import java.util.Random;

public class Main {

    public static void main(String[] args) {

        int[] array = new int[20];
        Random random = new Random();

        for (int i = 0; i < array.length; i++) {
            array[i] = random.nextInt(9999);
        }

        System.out.println("Basic array is: " + Arrays.toString(array));

        int minValue = array[0];
        int minIndex = 0;

        for (int i = 1; i < array.length; i++) {
            if (array[i] < minValue) {
                minValue = array[i];
                minIndex = i;
            }
        }

        System.out.println("Min value of array is: " + minValue);
        System.out.println("Min index of array is: " + minIndex);
    }
}
