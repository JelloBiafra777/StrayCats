package ru.gb.kazarezov.homework_2_2;

public class MyArraySizeException extends RuntimeException {


    public MyArraySizeException(int x, int y) {
        super("The dimensions of the array [" + x + ";" + y + "] are not ideal");

    }
}
