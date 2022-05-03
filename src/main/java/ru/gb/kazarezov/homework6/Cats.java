package ru.gb.kazarezov.homework6;

public class Cats extends Animals {

    private static int catCount;

    public Cats(String name, int age) {
        super(name, age);
        catCount = catCount + 1;
    }

    public static int getCatCount() {
        return catCount;
    }

    @Override
    public void running(int distance) {

        if ((distance <= 200)) {
            System.out.println(this.getName() + " runs for " + distance + " meters");
            System.out.println();
        } else {
            System.out.println(this.getName() + " do nothing. Distance is too long");
            System.out.println();
        }
    }

    @Override
    public void swimming(int distance) {
        System.out.println("Cats cannot swim. Swim yourself, please!");
        System.out.println();
    }
}

