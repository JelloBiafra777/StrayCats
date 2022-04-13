package ru.gb.kazarezov.homework_lesson_1;

public class checkSumSign {

    public static void checkSumSign() {

        int a = (int)(50 - Math.random()*100);
        int b = (int)(50 - Math.random()*100);
        System.out.println ("The random numbers are " + a + " and " + b);

        if ((a+b) > 0) {
            System.out.println("the sum is positive");
        } else {
            System.out.println("the sum is negative");
        }

    }

    public static void main(String[] args) {

        checkSumSign();

    }

}
