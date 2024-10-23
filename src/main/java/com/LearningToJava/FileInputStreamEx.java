package com.LearningToJava;

import java.io.FileInputStream;
import java.io.IOException;

public class FileInputStreamEx {
    public static void main(String[] args) throws IOException {
        String fileName = "smallfile.txt";
        FileInputStream fis = new FileInputStream(fileName);

        int i;
        while ((i = fis.read()) != -1) {
            System.out.print((char) i);
        }
        fis.close();

        System.out.println();

    }
}
