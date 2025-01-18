package com.LearningToJava;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        print(fill(new ArrayList<String>()));
        print(fill(new LinkedList<String>()));
        print(fill(new HashSet<String>()));
        print(fill(new TreeSet<String>()));
        print(fill(new LinkedHashSet<String>()));
        print(fill(new HashMap<String, String>()));
        print(fill(new TreeMap<String, String>()));
        print(fill(new LinkedHashMap<String, String>()));

    }

    static Collection fill(Collection<String> collection) {
        collection.add("rot");
        collection.add("cat");
        collection.add("map");
        collection.add("hack");

        return collection;
    }

    static Map fill(Map<String, String> map) {
        map.put("Крыса", "Анфиса");
        map.put("Кот", "Мурка");
        map.put("Собака", "Шарик");

        return map;
    }

    static void print(Collection collection) {
        System.out.println(collection);
    }

    static void print(Map map) {
        System.out.println(map);
    }

}
