package com.lesson10.tms.task6;

import java.util.Objects;

public class Student {
    String name;
    String lastname;
    int age;
    double middleMark;

    public String getName(){
        return name;
    }

    public String getLastname(){
        return lastname;
    }

    public int getAge(){
        return age;
    }

    public double getMiddleMark(){
        return middleMark;
    }

    public Student(String name, String lastname, int age, double middleMark) {
        this.name = name;
        this.lastname = lastname;
        this.age = age;
        this.middleMark = middleMark;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", lastname='" + lastname + '\'' +
                ", age=" + age +
                ", middleMark=" + middleMark +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Student student = (Student) o;
        return age == student.age && Double.compare(student.middleMark, middleMark) == 0 && name.equals(student.name) && lastname.equals(student.lastname);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, lastname, age, middleMark);
    }
}
