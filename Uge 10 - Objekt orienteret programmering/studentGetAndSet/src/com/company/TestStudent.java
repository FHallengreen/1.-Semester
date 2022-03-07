package com.company;

public class TestStudent {

    public static void main(String[] args) {
	Student student1 = new Student ("Frederik",27,88888888);
        System.out.println(student1.getName());
        System.out.println(student1.getStudentNumber());
        student1.setStudentNumber(437);
        System.out.println(student1.getStudentNumber());
    }
}
