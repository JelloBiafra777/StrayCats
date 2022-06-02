package ru.gb.kazarezov.chapter_2_homework_3;

import jdk.jshell.DeclarationSnippet;

public class App {

    public static void main(String[] args) {

        PhoneBook phoneBook = new PhoneBook();

        phoneBook.add("Petrov", "000");
        phoneBook.add("Ivanov", "333 333 333 ");
        phoneBook.add("Sidorov", "777 777 777 ");
        phoneBook.add("Petrov", "777-777-887");

        phoneBook.get("Petrov");
        phoneBook.get("Ivanov");

    }

}
