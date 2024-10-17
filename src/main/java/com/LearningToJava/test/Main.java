package com.LearningToJava.test;

import java.io.File;

public class Main {

    public static void main(String[] args) {

        File file = new File("C:\\Test", "Test.txt");
        System.out.println(file.exists());//true
    }

}
