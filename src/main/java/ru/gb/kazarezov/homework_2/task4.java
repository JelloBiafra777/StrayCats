package ru.gb.kazarezov.homework_2;

public class task4 {

    public static void main(String[] args) {

        printString("exploited", 25);

    }

    public static void printString(String str, int a) {

        for (int i = 1; i < a + 1; i++) {

            System.out.println(i + ": " + str);

        }

    }
}
