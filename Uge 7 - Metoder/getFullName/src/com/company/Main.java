package com.company;

public class Main {

    public String capitalize (String name){
        String capital =  name.substring(0, 1).toUpperCase();
        String lowercase = name.substring(1).toLowerCase();
        String correct = capital + lowercase;
        return correct;
    }

    public String getFullName(String lastName, String firstname, String middleName) {

        if (middleName == null) {
            return firstname + " " + lastName;
        }
        return capitalize(firstname) + " " + capitalize(middleName) + " " + capitalize(lastName);
    }

    public String getFullName(String lastName, String firstname) {

        return capitalize(firstname) + " " + capitalize(lastName);
    }

    public static void main(String[] args) {
        Main obj = new Main();
        System.out.println(obj.getFullName("HaNSEn", "frEDeRik", "hALLeNGreeEn"));
        System.out.println(obj.getFullName("Hansen", "Frederik"));
    }
}
