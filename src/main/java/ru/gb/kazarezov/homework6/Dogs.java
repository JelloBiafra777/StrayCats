package ru.gb.kazarezov.homework6;



public class Dogs extends Animals {
    private static int dogCount;

    public Dogs(String name, int age) {
        super(name, age);
        dogCount = dogCount + 1;
    }

    public static int getDogCount() {
        return dogCount;
    }

    @Override
    public void running(int distance) {

        if ((distance <= 500)) {
            System.out.println(this.getName() + " runs for " + distance + " meters");
            System.out.println();
        } else {
            System.out.println(this.getName() + " do nothing. Distance is too long");
            System.out.println();
        }
    }

    @Override
    public void swimming(int distance) {
        if ((distance <= 50)) {
            System.out.println(this.getName() + " runs for " + distance + " meters");
            System.out.println();
        } else {
            System.out.println(this.getName() + " do nothing. Distance is too long");
            System.out.println();
        }
    }



}
