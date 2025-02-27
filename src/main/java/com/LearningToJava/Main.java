package com.LearningToJava;

import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) {

        String text = "Hello World!";
        Map<Character, Integer> charFrequency = new HashMap<>();

        for (char ch : text.toCharArray()) {
            charFrequency.put(ch, charFrequency.getOrDefault(ch, 0) + 1);
        }

        System.out.println(charFrequency);  // Выведет частоты символов
    }
}
