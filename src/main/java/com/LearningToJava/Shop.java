package com.LearningToJava;

public class Shop {
    private Tovar[] arr = new Tovar[1];
    private int size;

    public void add(Tovar tovar) {
        arr[size] = tovar;
    }

    public void printAllTovars() {
        for (Tovar tovar: arr) {
            System.out.println(tovar.getName() + " " + tovar.getPrice());
        }
    }

}
