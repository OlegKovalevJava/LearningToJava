package com.LearningToJava;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Test> testList = new ArrayList<>();
        Test test = new Test(30, "Fox", new BigDecimal(10000));
        testList.add(test);
    }
}
