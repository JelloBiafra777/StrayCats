package ru.gb.kazarezov.Homework_3;

import java.util.Arrays;
import java.util.Random;

public class task1 {

    public static void main(String[] args) {

        int[] arr = new int[10];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = new Random().nextInt(2);
        }

        System.out.println("Initial array");
        System.out.println(Arrays.toString(arr));

        for (int i = 0; i < arr.length; i++) {
            switch (arr[i]) {
                case 0:
                    arr[i]=1;
                    break;
                case 1: arr[i]=0;
            }
        }

        System.out.println("Reworked array");
        System.out.println(Arrays.toString(arr));
    }

}
