package ru.gb.kazarezov.homework_2;

public class task3 {

    public static void main(String[] args) {

        System.out.println(checkNumSign(5));
        System.out.println(checkNumSign(-5));

    }

    public static boolean checkNumSign (int a) {

        if (a>=0) {
            return false;
        } else {
            return true;
        }
    }

}
