package ru.gb.kazarezov.Homework_3;

import java.util.Arrays;

public class task4 {

    public static void main(String[] args) {

        int arrayLength = 9; // можно воспользоваться командой length.arr[1], но мне так показалось корректнее.

        int[][] arr = new int[arrayLength][arrayLength];

        for (int i = 0; i < arrayLength; i++) {
            arr[i][i] = 1;
            arr[arrayLength - i - 1][i] = 1;
        }

        for (int i = 0; i < arrayLength; i++) {
            System.out.println(Arrays.toString(arr[i]));
        }

    }

}
