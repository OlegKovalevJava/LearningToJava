package com.LearningToJava;

import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        go();
    }


    public static void go() {

        Scanner scanner = new Scanner(System.in);

        System.out.println("numOne:");
        int numOne = scanner.nextInt();
        System.out.println("numTwo:");
        int numTwo = scanner.nextInt();
        System.out.println("operation:");
        char operation = scanner.next().charAt(0);

        if (operation == '+') {
            System.out.println(numOne + numTwo);
        }

        if (operation == '-') {
            System.out.println(numOne - numTwo);
        }

        if (operation == '/') {
            System.out.println(numOne / numTwo);
        }

        if (operation == '*') {
            System.out.println(numOne * numTwo);
        }

        System.out.println("NOOOOO");

    }

}
