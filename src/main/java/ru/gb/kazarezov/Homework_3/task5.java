package ru.gb.kazarezov.Homework_3;

import java.util.Arrays;

public class task5 {

    public static void main(String[] args) {

        System.out.println(Arrays.toString(fillTheArray(10,22)));

    }

    public static int[] fillTheArray(int len, int InitialValue) {

        int[] arr = new int[len];
        for (int i = 0; i < len; i++) {
            arr[i]=InitialValue;
        }
        return arr;
    }

}
