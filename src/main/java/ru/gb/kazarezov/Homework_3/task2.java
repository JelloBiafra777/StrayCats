package ru.gb.kazarezov.Homework_3;


import java.util.Arrays;

public class task2 {

    public static void main(String[]args){

        int[] arr = new int[100];
        for (int i = 0; i < arr.length; i++) {
            arr[i]=i+1;
        }

        System.out.println(Arrays.toString(arr));

    }

}
