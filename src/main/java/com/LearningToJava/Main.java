package com.LearningToJava;

public class Main {
    public static void main(String[] args) {
        Balance balanceTest = new Balance();

        balanceTest.addLeft(100);
        balanceTest.addRight(1000);
        System.out.println(balanceTest.getSituation());
    }

}
