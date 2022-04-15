package ru.gb.kazarezov.homework_2;

import java.security.spec.RSAOtherPrimeInfo;

public class task1 {

    public static void main(String[] args) {

        System.out.println(checkSum(5, 10));
    }

    public static boolean checkSum(int a, int b) {
        if ((10 <= a + b) && (a + b <= 20)) {
            return true;
        } else {
            return false;
        }

    }

}
