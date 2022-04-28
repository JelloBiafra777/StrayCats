package ru.gb.kazarezov.homework5;

import java.lang.reflect.Array;

public class Homework {

    public static void main(String[] args) {

        Employee[] Humanoids = new Employee[5];
        Humanoids[0] = new Employee("Robot Verter", "cat lover", "verter@overkill.com",
                "+7 777 333 555", 345, 33);
        Humanoids[1] = new Employee("Terminator", "world destroyer", "hasta_la_vista@overkill.com",
                "02", 1000, 1);
        Humanoids[2] = new Employee("Vtakopysk", "General manager of all", "Vtak@overkill.com",
                "+7 111", 100, 45);
        Humanoids[3] = new Employee("Robot Bobbot", "Lazy Barmaglot", "verter@overkill.com",
                "+7 777 333 555", 345, 33);
        Humanoids[4] = new Employee("Diablo", "koala lover", "diablo@overkill.com",
                "+6 666 666 666", 666666, 666);

        for (int i = 0; i < Humanoids.length; i++) {
            if (Humanoids[i].getAge() >= 40) {
                Humanoids[i].printEmployeeData();
            }
            System.out.println();
          }

    }
}
