package com.LearningToJava.test;

import java.io.File;
import java.util.Arrays;

public class Main {

    public static void main(String[] args) {

        File file = new File("C:\\Test");
        String[] files = file.list();

        System.out.println(Arrays.toString(files));

    }

}
