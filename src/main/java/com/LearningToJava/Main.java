package com.LearningToJava;

public class Main {
    public static void main(String[] args) {

        Shop shop = new Shop();

        shop.add(new Tovar("tovar1", 100));
        shop.add(new Tovar("tovar2", 150));

        shop.printAllTovars();

    }
}

