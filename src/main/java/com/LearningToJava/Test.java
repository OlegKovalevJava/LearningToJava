package com.LearningToJava;

public class Test {

    public static void main(String[] args) {

        int[] numbers = {6, 1, 5, 2, 4, 3};
        int[] numbers1 = {9, 8, 7, 6, 5, 4, 3, 2, 1, 0};
        int[] numbers2 = {1, 2, 0, 0, 0, 0, 0, 3};
        int[] numbers3 = {0, 0, 0};
        int[] numbers4 = {8, 9, 7, 8, 6, 7, 5, 6};

        System.out.println(goTest(numbers));
        System.out.println(goTest(numbers1));
        System.out.println(goTest(numbers2));
        System.out.println(goTest(numbers3));
        System.out.println(goTest(numbers4));
    }

    public static boolean goTest(int[] numbers) {
        int count = 0;

        for (int i = 0; i < numbers.length; i++) {
            for (int j = i + 1; j < numbers.length; j++) {

                int numberFirst = numbers[i];
                int numberSecond = numbers[j];

                if (numberFirst <= numberSecond) {

                }
            }
        }

        return count >= 2;
    }
}
