package com.LearningToJava;

import java.math.BigDecimal;

public class Test {
    private int age;
    private String FIO;
    private BigDecimal balance;

    public Test(String FIO) {
        this.FIO = FIO;
    }

    public Test(int age, String FIO, BigDecimal balance) {
        this.age = age;
        this.FIO = FIO;
        this.balance = balance;
    }

    @Override
    public String toString() {
        return "Test : age=" + age + ", FIO = " + FIO + ", balance=" + balance;
    }
}
