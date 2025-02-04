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

    @Override
    public String toString() {
        return "User{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", balance=" + balance +
                '}';
    }
}
