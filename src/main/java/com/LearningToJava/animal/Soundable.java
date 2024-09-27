package com.LearningToJava.animal;

public interface Soundable {
    void sound();

    default void doSomething() {
        System.out.println(",,,");
    }
}
