package com.LearningToJava;

public class Person {

    private int age;
    private String firstName;

    public Person(int age) {
        this(age, "unknown");
    }

    public Person(int age, String firstName) {
        this.age = age;
        this.firstName = firstName;
    }

    @Override
    public String toString() {
        return "NAME: " + firstName + "\nAGE: " + age;
    }

}
