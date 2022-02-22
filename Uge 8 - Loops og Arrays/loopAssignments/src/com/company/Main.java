package com.company;

import javax.swing.*;
import java.util.Locale;
import java.util.Random;

public class Main {


    String firstname = "Frederik";
    char index = 'i';
    int findI;
    String mockify = "du er sørme god til at kode";

    public void printOneLetter(){

        for (int i = 0; i <= 7; i++){
            char letter = firstname.charAt(i);
            System.out.println(letter);
        }

    }

    public int findIndexOf() {
        for (int i = 0; i <= 7; i++) {
            findI = firstname.indexOf(index);
            }
        if (!(findI == -1)){
            System.out.println("Fundet!");
        }
        else System.out.println(-1);
       return -1;
    }

    public void reverseString(){
        for (int i = 7; i>=0; i--){
            char letter = firstname.charAt(i);
            System.out.print(letter);
        }

    }

    Random random = new Random();
    public void mockify(){
        for (int i = 0; i<=26;i++){
            String letter = mockify.substring(i, i+1);
            int mockOrNot = random.nextInt(0,2);

            if (mockOrNot == 1){
                System.out.print(letter.toUpperCase());
            }
            else
             System.out.print(letter.toLowerCase());

        }
    }

    public static void main(String[] args) {
    Main obj = new Main();
//    obj.printOneLetter();
//    obj.findIndexOf();
//        obj.reverseString();
        obj.mockify();
    }
/*	String navn = "Frederik Hansen";
        String fornavn = "";

        for (int i=0;i<5;i++){
            char letter = navn.charAt(i);
            fornavn += letter;
        }
        System.out.println(fornavn);
    }*/
}
