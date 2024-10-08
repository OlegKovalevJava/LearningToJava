package com.LearningToJava.test;

public class Test {
    public static void main(String[] args) {

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
