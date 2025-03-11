package com.LearningToJava;

import java.util.StringJoiner;

public class Main {
    public static void main(String[] args) {

        StringJoiner stringJoiner = new StringJoiner(" ");

        stringJoiner.add("Один");
        stringJoiner.add("Два");
        stringJoiner.add("Три");

        System.out.println(stringJoiner);
    }
}
