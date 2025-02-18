package com.LearningToJava;

public class RomanToInteger {
    public int romanToInt(String S) {
        int result = 0;
        int num = 0;

        int i = S.length() - 1;

        while (i >= 0) {
            num = switch (S.charAt(i)) {
                case 'I' -> 1;
                case 'V' -> 5;
                case 'X' -> 10;
                case 'L' -> 50;
                case 'C' -> 100;
                case 'D' -> 500;
                case 'M' -> 1000;
                default -> num;
            };

            if (4 * num < result) {
                result -= num;
            } else result += num;

            i--;
        }

        return result;
    }
}
