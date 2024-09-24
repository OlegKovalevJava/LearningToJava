package com.LearningToJava.test;

public class Test {

    public static void main(String[] args) {

        int[] numbers1 = {10, 1, 2, 1, 2, 10};
        int[] numbers2 = {0, 0, 0, 0};
        int[] numbers3 = {1, 9, 8, 9, 8, 9, 2, 3};
        int[] numbers4 = {1, 9, 8, 9, 8, 9, 8, 9};
        int[] numbers5 = {8, 9, 8, 9, 8, 9, 8, 9};
        int[] numbers6 = {8, 9};
        int[] numbers7 = {8, 9, 7, 8, 6, 7, 5, 6};

        System.out.println(goTest(numbers1));
        System.out.println(goTest(numbers2));
        System.out.println(goTest(numbers3));
        System.out.println(goTest(numbers4));
        System.out.println(goTest(numbers5));
        System.out.println(goTest(numbers6));
        System.out.println(goTest(numbers7));

        System.out.println(checkInc(numbers1));
        System.out.println(checkInc(numbers2));
        System.out.println(checkInc(numbers3));
        System.out.println(checkInc(numbers4));
        System.out.println(checkInc(numbers5));
        System.out.println(checkInc(numbers6));
        System.out.println(checkInc(numbers7));
    }

    public static boolean goTest(int[] numbers) {

        if (numbers.length < 3) {
            return false;
        }

        int firstCounter = 0;
        int secondCounter = 0;

        for (int i = 0; i < numbers.length - 1; i++) {
            firstCounter++;

            if (numbers[i] <= numbers[i + 1]) {

                for (int j = firstCounter; j < numbers.length - 1; j++) {
                    if (numbers[firstCounter] <= numbers[j + 1]) {
                        secondCounter++;
                        break;
                    }
                }
            }
        }

        return secondCounter > 0;
    }

    public static boolean checkInc(int[] nums) {
        int firstMin = Integer.MAX_VALUE;
        int secondMin = Integer.MAX_VALUE;

        for (int num : nums) {
            if (num < firstMin) {
                firstMin = num;
            } else if (num < secondMin) {
                secondMin = num;
            } else {
                return true;
            }
        }

        return false;
    }

}
