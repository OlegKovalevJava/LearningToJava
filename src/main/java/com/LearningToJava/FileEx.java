package com.LearningToJava;

import java.io.File;
import java.io.IOException;

public class FileEx {
    public static void main(String[] args) throws IOException {

        File dir = new File("C:\\SomeDir");
        File file = new File(dir, "Hello.txt");
        dir.mkdir();
        file.createNewFile();





    }
}
