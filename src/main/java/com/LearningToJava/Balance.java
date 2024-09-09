package com.LearningToJava;

public class Balance {

    private int right;
    private int left;

    public void addRight(int n) {
        right = right + n;
    }

    public void addLeft(int n) {
        left = left + n;
    }

    public String getSituation() {
        if (right == left) {
            return "=";
        }

        if (right < left) {
            return "L";
        }

        return "R";
    }
}
