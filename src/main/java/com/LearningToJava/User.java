package com.LearningToJava;

import java.math.BigDecimal;

public class User {
    final int id;
    String name;
    BigDecimal balance;

    public User(int id, String name) {
        this.id = id;
        this.name = name;
    }

    public User(int id, String name, BigDecimal balance) {
        this(id, name);
        this.balance = balance;
    }

    public User(int id, String name, BigDecimal balance, int age) {
        this(id, name,balance);
        age = 10;
    }

    @Override
    public String toString() {
        return "User{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", balance=" + balance +
                '}';
    }
}
