package ru.gb.kazarezov.homework_lesson_1;

public class printColor {

    public static void printColor () {

        int value =  (int)(150 - Math.random()*300);
        System.out.println("Color code is " + value);

        if (value<=0) System.out.println("The color is red");
        if (value <=100 && value > 0)
            System.out.println("The color is yellow");
        if (value > 100) System.out.println("The color is green");

    }

    public static void main(String[] args) {

        printColor();

    }

}
