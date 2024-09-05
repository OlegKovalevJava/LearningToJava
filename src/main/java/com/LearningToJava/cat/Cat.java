package com.LearningToJava.cat;

import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
public class Cat {
    private double weight;
    private int age;
    private String color;
    private String name;

    public Cat(double weight, int age, String color) {
        this.weight = weight;
        this.age = age;
        this.color = color;
    }

    public Cat(double weight, int age, String color, String name) {
        this.weight = weight;
        this.age = age;
        this.color = color;
        this.name = name;
    }

}
