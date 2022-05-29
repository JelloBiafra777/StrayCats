package ru.gb.kazarezov.homework_2_2;

public class MyDataException extends RuntimeException{

    public MyDataException(String i) {
        super ("The type of value '" + i + "' must be integer");
    }
}

