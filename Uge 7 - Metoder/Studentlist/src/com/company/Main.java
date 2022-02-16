package com.company;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Main {

    public String capitalize(String name) {
        String capital = name.substring(0, 1).toUpperCase();
        String lowercase = name.substring(1).toLowerCase();
        String correct = capital + lowercase;
        return correct;
    }

    public String splittyMacSplit(String name) {
        String space = " ";
        int firstIndex = name.indexOf(space);
        String lastName = name.substring(0, firstIndex - 1);

        int lastIndex = name.indexOf(space);
        String firstName = name.substring(lastIndex + 1);

        return capitalize(firstName) + " " + capitalize(lastName);

    }

    public String getFullName(String lastName, String firstName) {

        return splittyMacSplit(firstName) + " " + splittyMacSplit(lastName);
    }
    public static void main(String[] args) throws FileNotFoundException {
        Main obj = new Main();
        File file = new File("students.txt");

        try {

            Scanner sc = new Scanner(file);

            while (sc.hasNextLine()) {
                String i = sc.nextLine();
                System.out.println(obj.splittyMacSplit(i));
            }
            sc.close();
        }
        catch (FileNotFoundException e) {
            e.printStackTrace();
    }
}}
