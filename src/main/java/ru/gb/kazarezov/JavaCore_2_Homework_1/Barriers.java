package ru.gb.kazarezov.JavaCore_2_Homework_1;

public abstract class Barriers {

    int SIZE;

    public Barriers(int SIZE) {
        this.SIZE = SIZE;
    }

    public abstract boolean isActionPerformed(Beings b);

    public int getSIZE() {
        return SIZE;
    }
}
