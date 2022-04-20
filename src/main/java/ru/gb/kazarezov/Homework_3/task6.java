package ru.gb.kazarezov.Homework_3;

import java.util.Arrays;
import java.util.Random;

public class task6 {

    public static void main(String[] args) {

        int[] arr = new int[10];

        for (int i = 0; i < arr.length; i++) {
            arr[i] = new Random().nextInt(10);
        }

        System.out.println("Original array");
        System.out.println(Arrays.toString(arr));

        int min = arr[1];
        int max = arr[1];

        for (int i = 0; i < arr.length; i++) {

            if (arr[i] > max) {
                max = arr[i];
            }

            if (arr[i] < min) {
                min = arr[i];
            }
        }

        System.out.println("Maximum number in array is " + max);
        System.out.println("Minimum number in array is " + min);

    }

}
