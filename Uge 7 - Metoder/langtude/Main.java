package com.company;

public class Main {
    public void langtUde(){
        System.out.println("Bjerget ligger langt ud' i skoven.");
    }
    public void aldrigSå(){
        System.out.println("aldrig så jeg så dejligt et ");
    }
    public void bjerg(){
        System.out.println("bjerg");
    }
    public static void main(String[] args) {
        System.out.println("Langt ud' i skoven lå et lille bjerg,");
        Main obj = new Main();
        obj.aldrigSå();
        obj.bjerg();
        obj.langtUde();
    }
}
