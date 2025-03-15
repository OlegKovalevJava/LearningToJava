package com.LearningToJava;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Main<T> {
    public static void main(String[] args) {

        Map<Person, String> personStringMap = new HashMap<>();

        personStringMap.put(new Person("Андрей"), "Хороший работник");
        personStringMap.put(new Person("Андрей1"), "Хороший работник1");
        personStringMap.put(new Person("Андрей2"), "Хороший работник2");
        personStringMap.put(new Person("Андрей3"), "Хороший работник3");
        personStringMap.put(new Person("Андрей4"), "Хороший работник4");

        List<Integer> stringList = new ArrayList<>();

        for (int i = 0; i < 100; i++) {
            stringList.add(i);
        }

        for (Integer i : stringList) {
            System.out.println(i);
        }
    }
}
