package com.LearningToJava;

public class Main {
    public static void main(String[] args) {

        int[] array = {1, 2, -1, 5, 3};

        int s = 0;
        for (int i = 0; i <= array.length - 1; i++) {
            s += array[i];
        }

        System.out.println(s);
    }

}
