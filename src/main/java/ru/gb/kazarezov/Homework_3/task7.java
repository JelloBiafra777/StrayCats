package ru.gb.kazarezov.Homework_3;

import java.util.Arrays;
import java.util.Random;

public class task7 {

    public static void main(String[] args) {

        int[] arrr = {2, 2, 2, 1, 2, 2, 10, 1};

        System.out.println(Arrays.toString(arrr));

        if (checkBalance(arrr)) {
            System.out.println("This array has the balance point!!!");
        } else {
            System.out.println("Sorry. No balance.");
        }

    }

    public static boolean checkBalance(int[] arr) {

        int sumLeft;
        int sumRight;

        for (int i = 0; i < arr.length; i++) {

            sumLeft = 0;
            sumRight = 0;

            for (int j = 0; j < i; j++) {
                sumLeft += arr[j];
            }

            for (int j = i; j < arr.length; j++) {
                sumRight += arr[j];
            }

            if (sumLeft == sumRight) {
                return true;
            }

        }

        return false;

    }

}
