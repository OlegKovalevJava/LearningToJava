package com.LearningToJava.animal;

public class Cat extends Animal implements Soundable {

    @Override
    public void print() {
        super.print();
    }

    @Override
    public void sound() {
        System.out.println("CAT");
    }

    @Override
    public String toString() {
        return "Cat: " + "weight - " + weight + ", age - " + age + ", " +
                "color - " + color + ", name - " + name;
    }
}