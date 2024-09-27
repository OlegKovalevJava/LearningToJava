package com.LearningToJava.animal;

public class Main {
    public static void main(String[] args) {

        Soundable soundable = () -> System.out.println("sound");

        soundable.sound();

    }
}
