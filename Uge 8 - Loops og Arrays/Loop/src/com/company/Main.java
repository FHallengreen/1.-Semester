package com.company;

public class Main {

    public int counter = 10;

    public void countDown(){

        if (counter > 0){
            counter--;
            System.out.println("Count: " + counter);
            countDown();
        }
    }
    public static void main(String[] args) {
	Main obj = new Main();
    obj.countDown();
    }
}
