package ru.gb.kazarezov.JavaCore_2_Homework_1;

public class RunningTrack extends Barriers{


    public RunningTrack(int SIZE) {
        super(SIZE);
    }

    @Override
    public boolean isActionPerformed(Beings b) {
        return (SIZE < b.getRUNLIMIT());
    }

    @Override
    public String toString() {
        return "RunningTrack " +
                " LENGHT = " + SIZE;
    }
}
