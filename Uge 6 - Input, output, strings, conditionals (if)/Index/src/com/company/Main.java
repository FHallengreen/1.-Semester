package com.company;

public class Main {

    public static void main(String[] args) {
	String text1 = "Dette er en tekst";

    String ord = "en";
    int startIndex = text1.indexOf(ord);
    int slutIndex = startIndex + ord.length();

        System.out.println("start er:" + startIndex);
        System.out.println("Slut er:" + slutIndex);

        System.out.println("Ordet er:" + text1.substring(startIndex, slutIndex));
    }
}
