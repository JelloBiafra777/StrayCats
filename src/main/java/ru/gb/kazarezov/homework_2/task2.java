package ru.gb.kazarezov.homework_2;

public class task2 {

    public static void main(String[] args) {

        checkNumberSign(10);
        checkNumberSign(-10);

    }

    public static void checkNumberSign(int a) {

        if (a>=0) {
            System.out.println("The number " + a + " is positive");
        } else {
            System.out.println("The number " + a + " is negative");
        }

    }

}
