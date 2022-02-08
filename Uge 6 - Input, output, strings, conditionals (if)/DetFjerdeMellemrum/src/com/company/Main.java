package com.company;

public class Main {

    public static void main(String[] args) {

        String potter = "Harry Potter and the Order of the Phoenix";

        String mellemrum = " ";
        int firstIndex  = potter.indexOf(mellemrum);
        int secondIndex = potter.indexOf(mellemrum, firstIndex + 1);
        int thirdIndex  = potter.indexOf(mellemrum, secondIndex + 1);
        int fourthIndex = potter.indexOf(mellemrum, thirdIndex + 1);
        int fithIndex   = potter.indexOf(mellemrum, fourthIndex+1);
        System.out.println(fourthIndex);

        String word        = potter.substring(fourthIndex,fithIndex);
        System.out.printf("%s ",word);
    }
}
