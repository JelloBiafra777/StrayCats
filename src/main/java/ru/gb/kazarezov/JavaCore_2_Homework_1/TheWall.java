package ru.gb.kazarezov.JavaCore_2_Homework_1;

public class TheWall extends Barriers {

    public TheWall(int SIZE) {
        super(SIZE);
    }

    @Override
    public boolean isActionPerformed(Beings b) {
        return (SIZE<b.getJUMPLOMIT());
    }

    @Override
    public String toString() {
        return "TheWall " +
                " HEIGHT " + SIZE;
    }
}
