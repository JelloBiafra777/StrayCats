package ru.gb.kazarezov.homework6;

public class application {

    public static void main(String[] args) {

        Cats cat = new Cats("Fury", 4);
        cat.running (50);
        cat.swimming(250);

        Cats kitty = new Cats("pippik", 1);
        kitty.running(180);

        Dogs dog = new Dogs("TuZig", 7);
        dog.running (50);
        dog.swimming(250);

        System.out.println("Total amount of animals: " + Animals.animalCount);
        System.out.println("Total amount of cats: " + Animals.catCount);
        System.out.println("Total amount of dogs: " + Animals.dogCount);


    }


}
