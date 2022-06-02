package ru.gb.kazarezov.chapter_2_homework_3;

public class PhoneBookRecord {
    private final String surname;
    private final String phoneNumber;

    public PhoneBookRecord(String surname, String phoneNumber) {
        this.surname = surname;
        this.phoneNumber = phoneNumber;
    }

    public String getSurname() {
        return surname;
    }

    @Override
    public String toString() {
        return "{surname='" + surname + '\'' +
                ", phoneNumber='" + phoneNumber + '\'' +
                '}';
    }
}

