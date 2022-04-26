package ru.gb.kazarezov.homework4;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class intellegent_tttoe {

    public static int[] coordinates;
    public static char[][] map;
    public static final int SIZE = 5;
    public static final int DOTS_TO_WIN = 4;
    public static final char DOT_EMPTY = '*';
    public static final char DOT_X = 'X';
    public static final char DOT_0 = '0';
    public static Scanner scanner = new Scanner(System.in);
    public static Random rnd = new Random();

    public static void main(String[] args) {

        initMap();
        printMap();

        while (true) {

            humanTurn();
            printMap();

            if (processing(DOT_X)) {
                System.out.println("Human wins !!!");
                break;
            }

            if (isMapFull()) {
                System.out.println("Everybody wins, dont worry!!!");
                break;
            }

            computerTurn();
            printMap();


            if (processing(DOT_0)) {
                System.out.println("Terminator wins !!!");
                break;
            }

            if (isMapFull()) {
                System.out.println("Everybody wins, dont worry!!!");
                break;
            }

        }

    }


    public static void initMap() {

        map = new char[SIZE][SIZE];

        for (int i = 0; i < SIZE; i++) {
            for (int j = 0; j < SIZE; j++) {
                map[i][j] = DOT_EMPTY;
            }
        }
    }

    public static void printMap() {

        for (int i = 0; i <= SIZE; i++) {
            System.out.print(i + "  ");
        }
        System.out.println();

        for (int i = 0; i < SIZE; i++) {
            System.out.print((i + 1) + "  ");
            for (int j = 0; j < SIZE; j++) {
                System.out.print(map[i][j] + "  ");
            }
            System.out.println();
        }

        System.out.println();
    }

    public static void humanTurn() {

        int x, y;
        do {
            System.out.println("Please ender your turn X,Y");
            x = scanner.nextInt() - 1;
            y = scanner.nextInt() - 1;
            if (!isCellvalid(x, y)) {
                printMap();
                System.out.println("Dear sir, looks like you are little bit stupid. Please try again!");
            }
        }
        while (!isCellvalid(x, y));
        map[x][y] = DOT_X;
    }

    public static void computerTurn() {

        if (!isDangerous()) {
            int x, y;
            do {
                x = rnd.nextInt(SIZE);
                y = rnd.nextInt(SIZE);
            } while (!isCellvalid(x, y));

            map[x][y] = DOT_0;
            System.out.println("Terminator's turn " + (x + 1) + " " + (y + 1));
        } else {

            System.out.println("DANGER!!!");
            map[coordinates[0]][coordinates[1]] = DOT_0;
        }
    }

    private static boolean isCellvalid(int x, int y) {

        return (x >= 0) && (y >= 0) && (x < SIZE) && (y < SIZE) && (map[x][y] != DOT_X) && (map[x][y] != DOT_0);
    }

    public static boolean isDangerous() {

        for (int i = 0; i < SIZE; i++) {
            for (int j = 0; j <= (SIZE - DOTS_TO_WIN); j++) {
                if (checkIfXXX(getArray(i, j, 0, 1))) {
                    System.out.println(Arrays.toString(getArray(i, j, 0, 1)));
                    coordinates = new int[2];
                    for (int k = 0; k < DOTS_TO_WIN; k++) {
                        if (getArray(i, j, 0, 1)[k] == DOT_EMPTY) {
                            coordinates[0] = i;
                            coordinates[1] = j + k;
                            System.out.println(Arrays.toString(coordinates));
                        }
                    }
                    return true;
                }
            }
        }

        for (int i = 0; i <= (SIZE-DOTS_TO_WIN); i++) {
            for (int j = 0; (j < SIZE); j++) {
                if (checkIfXXX(getArray(i, j, 1, 0))) {
                    System.out.println(Arrays.toString(getArray(i, j, 1, 0)));
                    coordinates = new int[2];
                    for (int k = 0; k < DOTS_TO_WIN; k++) {
                        if (getArray(i, j, 1, 0)[k] == DOT_EMPTY) {
                            coordinates[0] = i + k;
                            coordinates[1] = j;
                            System.out.println(Arrays.toString(coordinates));
                        }
                    }
                    return true;
                }
            }
        }

          return false;
    }


    private static boolean checkIfXXX(char[] arr) {

        int count_X = 0;
        int count_EMPTY = 0;

        for (int i = 0; i < DOTS_TO_WIN; i++) {

            if (arr[i] == DOT_X) {
                count_X++;
            }
            if (arr[i] == DOT_EMPTY) {
                count_EMPTY++;

            }
        }
        return ((count_X == 3) && (count_EMPTY == 1));
    }

    public static boolean processing(char s) {

        for (int i = 0; i < SIZE; i++) {
            for (int j = 0; j < SIZE; j++) {
                if (map[i][j] != s) {
                    continue;
                }
                if (((j + DOTS_TO_WIN) <= SIZE) && (map[i][j + 1] == s)) {
                    if (checkIfVictory(getArray(i, j, 0, 1), s)) {
                        System.out.println("Victory!");
                        return true;
                    }
                }

                if (((j + DOTS_TO_WIN) <= SIZE) && ((i + DOTS_TO_WIN) <= SIZE) && (map[i + 1][j + 1] == s)) {
                    if (checkIfVictory(getArray(i, j, 1, 1), s)) {
                        System.out.println("Victory!");
                        return true;

                    }
                }

                if (((i + DOTS_TO_WIN) <= SIZE) && (map[i + 1][j] == s)) {
                    if (checkIfVictory(getArray(i, j, 1, 0), s)) {
                        System.out.println("Victory!");
                        return true;

                    }
                }

                if (((i - DOTS_TO_WIN + 1) >= 0) && ((j + DOTS_TO_WIN) <= SIZE) && (map[i - 1][j + 1] == s)) {
                    if (checkIfVictory(getArray(i, j, -1, 1), s)) {
                        System.out.println("Victory!");
                        return true;
                    }
                }
            }

        }

        return false;
    }

    public static char[] getArray(int x, int y, int V_pitch, int H_pitch) {

        char[] string = new char[DOTS_TO_WIN];
        for (int i = 0; i < DOTS_TO_WIN; i++) {
            string[i] = map[x + i * V_pitch][y + i * H_pitch];
        }
        return string;

    }

    public static boolean checkIfVictory(char[] string, char s) {

        for (int i = 0; i < DOTS_TO_WIN; i++) {
            if (string[i] != s) return false;
        }
        return true;
    }

    public static boolean isMapFull() {

        for (int i = 0; i < SIZE; i++) {
            for (int j = 0; j < SIZE; j++) {
                if (map[i][j] == DOT_EMPTY) {
                    return false;
                }
            }
        }
        return true;
    }


}



