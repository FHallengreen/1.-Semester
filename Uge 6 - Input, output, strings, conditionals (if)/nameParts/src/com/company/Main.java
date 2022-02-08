package com.company;

import java.util.Locale;

public class Main {

    public static void main(String[] args) {
        String fornavn = "Fornavn: Frederik";
        String mellemnavn = "Mellemnavn: Hallengreen";
        String efternavn = "Efternavn: Hansen";

        System.out.printf("%s\n%s\n%s\n", fornavn, mellemnavn, efternavn);

        String semicolon = " ";
        int firstIndex = fornavn.indexOf(semicolon);
        String firstF = fornavn.substring(firstIndex + 1);
        int middleIndex = mellemnavn.indexOf(semicolon);
        String middleF = mellemnavn.substring(middleIndex + 1);
        int lastIndex = efternavn.indexOf(semicolon);
        String lastF = efternavn.substring(lastIndex + 1);

        System.out.printf("%s %s %s", firstF, middleF, lastF);
    }
}