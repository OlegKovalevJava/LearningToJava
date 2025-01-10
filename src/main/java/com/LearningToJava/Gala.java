package com.LearningToJava;

public class Gala extends Apple{
    @Override
    public long id() {
        return super.id();
    }

    public void gogogog() {
        System.out.println("gogogog");
    }

    @Override
    public void say() {
        System.out.println("яблоко наследник");
    }
}
