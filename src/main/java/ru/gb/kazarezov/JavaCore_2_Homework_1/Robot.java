package ru.gb.kazarezov.JavaCore_2_Homework_1;

public class Robot implements Beings {

    final int RUN_LIMIT = 200;
    final int JUMP_LIMIT = 10;


    @Override
    public String toString() {
        return "Robot, " +
                "RUN_LIMIT=" + RUN_LIMIT +
                ", JUMP_LIMIT=" + JUMP_LIMIT;
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