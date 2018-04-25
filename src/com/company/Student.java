package com.company;

public class Student extends Person {
    int course;

    public Student(int height, String name, int course){
    super(height, name);
    this.course = course;

    }

    public void tell (){
        System.out.println(super.height);
        System.out.println(super.name);
        System.out.println(course);
    }

}