package com.LearningToJava.animal;

public class Main {
    public static void main(String[] args) {

        Cat tom = new Cat(10.0, 10, "Black", "Tom");
        System.out.println(tom);

        tom.changeWeightOfAnimal(-10.1);
        System.out.println(tom);

        System.out.println(tom.getWeight());


    }
}
