package com.company;

public class Pensioneer extends Person {

    int age;

    public Pensioneer(int height, String name, int age){
        super(height, name);
        this.age = age;

    }

    public void returnPensioner () {
        System.out.println(super.height);
        System.out.println(super.name);
        System.out.println(age);
    }

}
