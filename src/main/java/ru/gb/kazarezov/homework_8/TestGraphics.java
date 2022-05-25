package ru.gb.kazarezov.homework_8;

import javax.swing.*;


public class TestGraphics extends JFrame {

    public TestGraphics() {

        setTitle("Test Window");
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        setBounds(300, 300, 400, 400);
        setVisible(true);

    }

    public static void main(String[] args) {

        new TestGraphics();

    }

}


