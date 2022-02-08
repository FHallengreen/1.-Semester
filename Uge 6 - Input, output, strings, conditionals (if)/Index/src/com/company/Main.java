package com.company;

public class Main {

    public static void main(String[] args) {
	String text1 = "Mit navn er Frederik";

    String ord = "Frederik";
    int startIndex = text1.indexOf(ord);
    int slutIndex = startIndex + ord.length();
        // start og slut bliver udskrevet. De har altså placering 9-11.
        System.out.println("Start er:" + startIndex);
        System.out.println("Slut er:" + slutIndex);
        // ordet "en" bliver nu printet.
        System.out.println("Ordet er:" + text1.substring(startIndex, slutIndex));
    }
}
