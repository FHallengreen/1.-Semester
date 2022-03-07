package com.company;

class Client {

    private String name;        // attribute
    private int age;         // attribute

    //Constructor method

    public Client(String name, int age) {
        this.name = name;
        this.age = age;
    }

    //adfærd

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
