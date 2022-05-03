package ru.gb.kazarezov.homework6;

public abstract class Animals {

    private static int animalCount;

    private String name;
    private int age;

    public Animals(String name, int age) {
        this.name = name;
        this.age = age;
        animalCount = animalCount + 1;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public static int getAnimalCount() {
        return animalCount;
    }

    public abstract void running(int length);

    public abstract void swimming(int length);
}