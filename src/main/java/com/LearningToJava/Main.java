package com.LearningToJava;

import java.math.BigDecimal;
import java.util.*;

public class Main {
    public static void main(String[] args) {
        List<Test> testList = new ArrayList<>();
        testList.add(0, new Test(20, "Fox", new BigDecimal(555)));

        Queue<Test> testQueue = new ArrayDeque<>();
        testQueue.add(new Test("Max"));

        Set<Test> testSet = new HashSet<>();
        testSet.add(new Test("Pax"));

        Map<Integer, Test> testMap = new HashMap<>();
        testMap.put(10, new Test("Hax"));

        System.out.println(testList);
        System.out.println(testQueue);
        System.out.println(testSet);
        System.out.println(testMap);

    }
}
