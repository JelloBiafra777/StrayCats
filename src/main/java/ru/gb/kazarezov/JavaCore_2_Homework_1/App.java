package ru.gb.kazarezov.JavaCore_2_Homework_1;

import java.util.Random;
import java.util.Scanner;

public class App {


    public static void main(String[] args) {

        final int NUMBER_OF_BEINGS = 5;
        final int NUMBER_OF_BARRIERS = 5;
        Random rnd = new Random();
        Scanner in = new Scanner(System.in);


        Beings[] beings = new Beings[NUMBER_OF_BEINGS];
        Barriers[] barriers = new Barriers[NUMBER_OF_BARRIERS];

        for (int i = 0; i < NUMBER_OF_BEINGS; i++) {

            switch (rnd.nextInt(3)) {
                case 0:
                    beings[i] = new Human();
                    break;
                case 1:
                    beings[i] = new Cat();
                    break;
                case 2:
                    beings[i] = new Robot();
                    break;
            }
        }
        for (int i = 0; i < NUMBER_OF_BARRIERS; i++) {

            switch (rnd.nextInt(2)) {
                case 0:
                    barriers[i] = new RunningTrack(rnd.nextInt(150));
                    break;
                case 1:
                    barriers[i] = new TheWall(rnd.nextInt(20));
                    break;
            }

        }


        System.out.println("Participants are: ");

        for (Beings being : beings) {
            System.out.println(being.toString());
        }

        System.out.println();
        System.out.println("The barriers are:");

        for (Barriers barrier : barriers) {

            System.out.println(barrier.toString());


        }

        System.out.println();
        System.out.println("AND LET THE DEATH RACE BEGINS !!!! ");
        System.out.println("Press enter to continue ... ");
        String a = in.nextLine();

        for (Beings being : beings) {

            System.out.println("Participant " + being.toString() + " follows his doomed fate... ");



            for (Barriers barrier : barriers) {

                if(barrier.isActionPerformed(being)) {
                    System.out.println(barrier + " is passed !!!");
                } else {
                    System.out.println(barrier + " was not passed, participant dies ... ");
                    break;
                }
            }

            System.out.println();



        }
    }
}


