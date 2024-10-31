package com.LearningToJava;

import java.io.*;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;

public class Main {
    public static void main(String[] args) throws IOException {
        copyFileUsingStream(new File("src/win1251.txt"),
                Charset.forName("windows-1251"),
                new File("src/utf8.txt")
        );
    }

    private static void copyFileUsingStream(File source, Charset sourceEnc, File dest) throws IOException {
        Reader fis = new FileReader(String.valueOf(sourceEnc));
        Writer fos = new FileWriter(String.valueOf(StandardCharsets.UTF_8));
        char[] buffer = new char[1024];
        int length;
        while ((length = fis.read(buffer)) > 0) {
            fos.write(buffer, 0, length);
        }
        fis.close();
        fos.close();
    }
}
