package com.company;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws FileNotFoundException {
        File file = new File("students.txt");

        try {

            Scanner sc = new Scanner(file);

            while (sc.hasNextLine()) {
                String i = sc.nextLine();
                System.out.println(i);
            }
            sc.close();
        }
        catch (FileNotFoundException e) {
            e.printStackTrace();

    }
}}
