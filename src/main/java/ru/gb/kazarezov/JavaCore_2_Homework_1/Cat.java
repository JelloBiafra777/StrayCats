package ru.gb.kazarezov.JavaCore_2_Homework_1;

public class Cat implements Beings {

    final int RUN_LIMIT = 150;
    final int JUMP_LIMIT = 50;


    @Override
    public String toString() {
        return "Cat, " +
                "RUN_LIMIT=" + RUN_LIMIT +
                ", JUMP_LIMIT=" + JUMP_LIMIT;
    }

    public int getRUN_LIMIT() {
        return RUN_LIMIT;
    }

    public int getJUMP_LIMIT() {
        return JUMP_LIMIT;
    }

    @Override
    public void run() {

    }

    @Override
    public void jump() {

    }

    @Override
    public int getRUNLIMIT() {
        return this.RUN_LIMIT;
    }

    @Override
    public int getJUMPLOMIT() {
        return this.JUMP_LIMIT;
    }
}
