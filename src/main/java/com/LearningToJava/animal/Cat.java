package com.LearningToJava.animal;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
@AllArgsConstructor
public class Cat {
    private double weight;
    private int age;
    private String color;
    private String name;

    public double changeWeightOfAnimal(double weightChange) {

        weight = weight + weightChange;

        if (weight <= 0) {
            weight = 0.0;
        }

        return weight;
    }

    @Override
    public String toString() {
        return "Cat: " + "weight - " + weight + ", age - " + age + ", " +
                "color - " + color + ", name - " + name;
    }
}
