package com.company;

public class Main {

    public static void main(String[] args) {
        String fornavn = "Fornavn: Frederik";
        String mellemnavn = "Mellemnavn: Hallengreen";
        String efternavn = "Efternavn: Hansen";

        System.out.printf("%s\n%s\n%s\n", fornavn, mellemnavn, efternavn);

        System.out.println(fornavn.substring(9) + mellemnavn.substring(11) + efternavn.substring(10));
    }
}
