package ru.gb.kazarezov.chapter_2_homework_3;

import java.util.LinkedList;

public class PhoneBook {

    LinkedList<PhoneBookRecord> p = new LinkedList<>();

    public void add(String surname, String phoneNumber) {

        PhoneBookRecord record = new PhoneBookRecord(surname, phoneNumber);
        p.add(record);
    }

    public void get(String surname) {

        for (PhoneBookRecord record : p) {
            if (surname.equals(record.getSurname())) {
                System.out.println(record);
            }
        }
        System.out.println();
    }

}
