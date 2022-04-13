package ru.gb.kazarezov.homework_lesson_1;

public class Task_5 {

    public static void compareNumbers() {

        int a = (int)(50 - Math.random()*100);
        int b = (int)(50 - Math.random()*100);
        System.out.println ("a = " + a + " b = " + b);

        if (a>=b) System.out.println("a >= b");
            else System.out.println("a < b");

    }

    public static void main(String[] args) {

        compareNumbers();

    }

}
