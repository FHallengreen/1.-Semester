package com.company;

public class Main {

    public String getFullName(String lastName, String firstname, String middleName) {

        String capitalF = firstname.substring(0, 1).toUpperCase();
        String lowercaseF = firstname.substring(1).toLowerCase();
        String capitalM = middleName.substring(0, 1).toUpperCase();
        String lowercaseM = middleName.substring(1).toLowerCase();
        String capitalL = lastName.substring(0, 1).toUpperCase();
        String lowercaseL = lastName.substring(1).toLowerCase();

        if (middleName == null) {
            return firstname + " " + lastName;
        }
        return capitalF + lowercaseF + " " + capitalM + lowercaseM + " " + capitalL + lowercaseL;
    }

    public String getFullName(String lastName, String firstname) {
        String capitalF = firstname.substring(0, 1).toUpperCase();
        String lowercaseF = firstname.substring(1).toLowerCase();
        String capitalL = lastName.substring(0, 1).toUpperCase();
        String lowercaseL = lastName.substring(1).toLowerCase();

        return capitalF + lowercaseF + " " + capitalL + lowercaseL;
    }

    public static void main(String[] args) {
        Main obj = new Main();
        System.out.println(obj.getFullName("HaNSEn", "frEDeRik", "hALLeNGreeEn"));
        System.out.println(obj.getFullName("Hansen", "Frederik"));
    }
}
