package ru.gb.kazarezov.homework_7;

import org.w3c.dom.ls.LSOutput;

import java.util.Objects;
import java.util.Random;
import java.util.Scanner;


public class application {

    static Scanner scanner = new Scanner(System.in);
        static Plate plate = new Plate(30);
    static Random rnd = new Random();
    static Cats[] kitties = {
            new Cats("Kuzma", rnd.nextInt(20)),
            new Cats("Mirinda", rnd.nextInt(20)),
            new Cats("CreatorCat", rnd.nextInt(20)),
            new Cats("Malevolent creation", rnd.nextInt(20)),
            new Cats("Maximilian", rnd.nextInt(20))
    };

    public static void main(String[] args) {

        String continueConfirmaion;
        do {
            printAllInformation();
            System.out.println("Should we start to feed the cats? Y/N ");
            continueConfirmaion = scanner.next();

            if (Objects.equals(continueConfirmaion, "N")){
                continue;
            }
            feedTheCats();
            if (checkCats()) {
                System.out.println("all the kitties are fed, you must leave, pathetic human being!!!");
                break;
            }
            System.out.println("At the plate only  " + plate.getVolume() + " food left. How much should we add?");
            plate.putFoodToPlate(scanner.nextInt());

        } while (!Objects.equals(continueConfirmaion, "N"));

    }

    public static void feedTheCats (){

        for (Cats kitty : kitties) {

            if (kitty.isSatiety()) {
                System.out.println("Kitty named " + kitty.getName() + " is already full & happy");
                continue;
            }
            if (kitty.getAppetite() <= plate.getVolume()) {
                plate.decreaseFood(kitty.getAppetite());
                System.out.println("Kitty named  " + kitty.getName() + " eats " + kitty.getAppetite() + " foods");
                System.out.println("current plate status is " + plate.getVolume() + " foods");
                kitty.setSatiety(true);
            } else {
                System.out.println("You will burn in hell because kitty " + kitty.getName() + " is still hungry");
            }
        }

    }

    public static boolean checkCats () {

        for (Cats kitty : kitties) {
            if (!kitty.isSatiety()) {
                return false;
            }
        }
        return true;
    }
    private static void printAllInformation() {

        System.out.println("Current  plate status is " + plate.getVolume() + " foods");
        for (Cats kitty : kitties) {
            System.out.println("kitty named " + kitty.getName() + " has " + kitty.getAppetite() + " appetite");
            if (kitty.isSatiety()) {
                System.out.println("kitty is satisfied");
            } else {
                System.out.println("kitty is still hungry, you should work better");
            }

        }
        System.out.println();

    }

}

