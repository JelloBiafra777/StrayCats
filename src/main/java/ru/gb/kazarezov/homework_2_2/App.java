package ru.gb.kazarezov.homework_2_2;

import java.util.Random;
import java.util.Scanner;

public class App {

    static final int idealArraySize = 4;
    static Scanner in = new Scanner(System.in);
    static Random rnd = new Random();


    public static void main(String[] args) {


        System.out.print("Please enter X array dimension: ");
        int arrayX = in.nextInt();
        System.out.print("Please enter Y array dimension: ");
        int arrayY = in.nextInt();

        String[][] strArray = new String[arrayX][arrayY];

        if ((strArray.length != idealArraySize) || (strArray[0].length != idealArraySize)) {
            throw new MyArraySizeException(strArray.length, strArray[0].length);
        }

        for (int i = 0; i < strArray.length; i++) {
            for (int j = 0; j < strArray[0].length; j++) {
                strArray[i][j] = Integer.toString(rnd.nextInt(10));
            }
        }

        strArray[3][2] = "cats";

        System.out.println("The total amount of all elements of the array are: " + summarizeArray(strArray));

    }

    public static int summarizeArray(String[][] str) {

        int sum = 0;

        for (int i = 0; i < str.length; i++) {
            for (int j = 0; j < str[0].length; j++) {
                try {
                    sum = sum + Integer.parseInt(str[i][j]);
                } catch (NumberFormatException e) {
                    System.out.println("The index of element with wrong value type are [" + i + ";" + j + "]");
                    throw new MyDataException(str[i][j]);
                }
            }
        }
        return sum;
    }

}



