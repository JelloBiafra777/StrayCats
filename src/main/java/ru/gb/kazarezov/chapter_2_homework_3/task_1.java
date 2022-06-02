package ru.gb.kazarezov.chapter_2_homework_3;

import java.util.*;

public class task_1 {

    public static void main(String[] args) {

        LinkedList<String> linkedList = new LinkedList<>();

        linkedList.add("First");
        linkedList.add("Second");
        linkedList.add("Third");
        linkedList.add("Third");
        linkedList.add("Third");
        linkedList.add("Forth");
        linkedList.add("Forth");
        linkedList.add("Forth");
        linkedList.add("Forth");
        linkedList.add("Fifth");
        linkedList.add("Fifth");
        linkedList.add("Fifth");
        linkedList.add("Fifth");
        linkedList.add("Second");


        System.out.println("Unique words in the collection are: " + new HashSet(linkedList));
        System.out.println();

        ListIterator<String> iter = linkedList.listIterator();

        while (iter.hasNext()) {
            String currentWord = iter.next();
            int wordCount = 1;
            iter.remove();
            while (iter.hasNext()) if (currentWord.equals(iter.next())) {
                wordCount++;
                iter.remove();
            }

            System.out.println("word " + currentWord + " contains " + wordCount + " times");

            while (iter.hasPrevious()) {
                iter.previous();
            }

        }

    }

}



