package com.LearningToJava;

public class Main {
    public static void main(String[] args) {
        String text = "FIFA will never regret it";

        String[] words = text.split("\\s*(\\s|,|!|\\.)\\s*");

        for (String word : words) {
            System.out.println(word);
        }

        String input = "+11122233344";

        boolean result = input.matches("(\\+*)\\d{11}");

        if (result) {
            System.out.println("It is a phone number");
        } else {
            System.out.println("It is not a phone number!");
        }

    }
}
