package com.company;

public class Main {

    public static void main(String[] args) {
	Student student1 = new Student ("Frederik",27,8888888);
        System.out.println(student1.getName());
        System.out.println(student1.getStudentNumber());
        System.out.println(student1.getPhoneNumber());
        student1.setPhoneNumber(42951647);
        System.out.println(student1.getPhoneNumber());
    }
}
