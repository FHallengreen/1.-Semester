package com.company;


public class Main {

    public int indexOfIntArray (int[] array, int search) {
        for (int i = 0; i < array.length; ++i) {
            if (search == array[i]) {
                System.out.println(i);
                return i;
            }
        }
        return -1;
    }

    public int indexOfStringArray (String[] array, String search) {
        for (int i = 0; i < array.length; ++i) {
            if (search == array[i]) {
                System.out.println(i);
                return i;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        int search = 58;
        int [] index = {1,5,12,54,58,21};

        String [] indexString = {"Færge", "Ubåd", "Jolle", "Containerskib"};
        String searchString = "Jolle";

        double [] indexDouble = {30.50,22.50,44.53,69.42};
        double searchDouble = 44;
	Main obj = new Main();
        obj.indexOfIntArray(index,search);
        obj.indexOfStringArray(indexString,searchString);
    }
}
