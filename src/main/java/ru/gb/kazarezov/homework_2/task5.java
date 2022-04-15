package ru.gb.kazarezov.homework_2;

public class task5 {

    public static void main(String[] args) {

        System.out.println(checkIfYearIsLeap(1600));
        System.out.println(checkIfYearIsLeap(1988));
        System.out.println(checkIfYearIsLeap(1800));
        System.out.println(checkIfYearIsLeap(1997));

    }

    public static boolean checkIfYearIsLeap(int year) {

        if ((year % 4) != 0) {
            return false;
        } else if ((year % 100) != 0) {
            return true;
        } else if ((year % 400) != 0) {
            return false;
        } else {
            return true;
        }
    }

}
