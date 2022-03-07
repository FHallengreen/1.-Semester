package com.company;

public class Student {

    private String name;
    private int studentNumber;
    private int phoneNumber;
    private boolean isTutor;
    private int grade;

    public Student(String name, int studentNumber, int phoneNumber, boolean isTutor, int grade) {
        this.name = name;
        this.studentNumber = studentNumber;
        this.phoneNumber = phoneNumber;
        this.isTutor = isTutor;
        this.grade = grade;
    }

    public int getGrade() {
        return grade;
    }

    public void setGrade(int grade) {
        this.grade = grade;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getStudentNumber() {
        return studentNumber;
    }

    public void setStudentNumber(int studentNumber) {
        this.studentNumber = studentNumber;
    }

    public int getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(int phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public boolean isTutor() {
        return isTutor;
    }

    public void setTutor(boolean tutor) {
        isTutor = tutor;
    }
    public String toString (){

        return "Name: " + name + '\n' + "Er tutor: " + isTutor + '\n' + "Karakter: " + grade;
    }
}
