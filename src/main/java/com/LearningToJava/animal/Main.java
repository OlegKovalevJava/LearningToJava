package com.LearningToJava.animal;

public class Main {
    public static void main(String[] args) {

        Cat cat = new Cat(10, "Black");
        cat.changeWeightOfAnimal(cat.getWeight(), 550);
        System.out.println(cat.getWeight());


    }
}
