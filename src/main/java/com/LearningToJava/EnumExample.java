package com.LearningToJava;

public class EnumExample {
    public static void main(String[] args) {

        long startTime = System.currentTimeMillis();

        String str = "";

        for (int i = 0; i < 10000; i++) {
            str += i;
        }

        long endTime = System.currentTimeMillis();
        System.out.println("Time taken by String: " + (endTime - startTime) + "ms");

        startTime = System.currentTimeMillis();

        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < 10000; i++) {
            sb.append(i);
        }

        endTime = System.currentTimeMillis();

        System.out.println("Time taken by StringBuilder: " + (endTime - startTime) + "ms");

    }
}
