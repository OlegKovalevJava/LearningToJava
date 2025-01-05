package com.LearningToJava;

import java.math.BigDecimal;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.List;
import java.util.Queue;

public class Main {
    public static void main(String[] args) {
        List<Test> testList = new ArrayList<>();

        testList.add(0, new Test(20, "Fox", new BigDecimal(555)));
        testList.add(1, new Test(30, "Mox", new BigDecimal(111111)));
        testList.add(2, new Test(20, "Fox", new BigDecimal("99999999.99")));

        Queue<Test> testQueue = new ArrayDeque<>();

        testQueue.add(new Test("Max"));


    }
}
