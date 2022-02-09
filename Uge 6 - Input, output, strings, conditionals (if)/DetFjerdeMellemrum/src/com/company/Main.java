package com.company;

public class Main {

    public static void main(String[] args) {

        String potter = "Harry Potter and the Order of the Phoenix";
        // Starter med at finde ud af hvor mange tegn der er totalt (41), da det kan bruges senere hen.
        System.out.println("Længden af tegn er: " + potter.length());

        // ved hjælp af index finder vi nu frem til det fjerde mellemrum.
        String mellemrum = " ";
        int firstIndex  = potter.indexOf(mellemrum);
        int secondIndex = potter.indexOf(mellemrum, firstIndex + 1);
        int thirdIndex  = potter.indexOf(mellemrum, secondIndex + 1);
        int fourthIndex = potter.indexOf(mellemrum, thirdIndex + 1);
        int fifthIndex   = potter.indexOf(mellemrum, fourthIndex+1);
        System.out.println("Det fjerde mellemrum kommer efter følgende antal tegn: " + fourthIndex);

        // Vi ved så at fourthIndex starter på 20. For at få første og sidste cifre
        String word         = potter.substring(fourthIndex,fifthIndex);
        String firstWord    = potter.substring(21,22);

        int lastWord        = potter.substring(fourthIndex,fifthIndex).length();
        String WordLast     = word.substring(lastWord-1);
        int hexaStart       = firstWord.codePointAt(0);
        int hexaSlut        = WordLast.codePointAt(0);
        System.out.printf("%s \n %s %s \n",word, firstWord, WordLast);
        System.out.printf("%04x %04x", hexaStart, hexaSlut);
    }
}
