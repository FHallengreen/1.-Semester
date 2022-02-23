package com.company;

import javax.swing.*;
import java.util.Locale;
import java.util.Random;

public class Main {

    String firstname = "Frederik";
    char index = 'i';
    int findI;
    String mockify = "du er sørme god til at kode";
    Random random = new Random();

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

    public void starblock(int width, int height){
        for (int x = 1; x<=height;x++){
            for (int y = 1; y<=width ;y++){
                System.out.print("*");
            }
            System.out.println();
        }
    }

    public void printMulTable(int width, int height){
        for (int x = 1; x<=height;x++){
            for (int y = 1; y<=width ;y++){
                System.out.printf("%5d ",x*y);
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
    Main obj = new Main();
//    obj.printOneLetter();
//    obj.findIndexOf();
//        obj.reverseString();
//        obj.mockify();
//        obj.starblock(5,3);
        obj.printMulTable(10,10);
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
