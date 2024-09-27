package com.LearningToJava.animal;

public class Dog extends Mammal implements Soundable {

    @Override
    public void print() {
        System.out.println("DOG");
    }

    @Override
    public void sound() {
        System.out.println("Bark!");
    }

    @Override
    public String toString() {
        return "Cat: " + "weight - " + weight + ", age - " + age + ", " +
                "color - " + color + ", name - " + name;
    }


}
