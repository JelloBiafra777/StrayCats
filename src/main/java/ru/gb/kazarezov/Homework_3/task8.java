package ru.gb.kazarezov.Homework_3;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class task8 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int[] arr = new int[10];

        for (int i = 0; i < arr.length; i++) {
            arr[i] = new Random().nextInt(10);
        }

        System.out.println("Please enter the pitch");
        int a = scanner.nextInt();

        System.out.println("Original array:");
        System.out.println(Arrays.toString(arr));

        pitchTheArray(arr, a);

    }

    public static void pitchTheArray(int[] arr, int pitch) {

        while (pitch < 0) {
            pitch = pitch + arr.length;
        }

        pitch = pitch % arr.length;

        for (int i = 0; i < pitch; i++) {

            int nextVal;
            int prevVal = arr[0];
            arr[0] = arr[arr.length - 1];

            for (int j = 0; j < arr.length - 1; j++) {

                nextVal = arr[j + 1];
                arr[j + 1] = prevVal;
                prevVal = nextVal;

            }
        }
        System.out.println("Pitched array:");
        System.out.println(Arrays.toString(arr));

    }

}

