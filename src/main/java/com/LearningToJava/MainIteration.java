package com.LearningToJava;

import java.util.Iterator;
import java.util.LinkedList;

public class MainIteration {
    public static void main(String[] args) {

        Integer[] array = new Integer[]{64,42,73,41,32,53,16,24,57,42,74,55,26};

        LinkedList<Integer> list = new LinkedList<>();

//        Collections.addAll(list, array);
//
//        for (Integer i : list) {
//            System.out.println(i);
//        }

        Iterator<Integer> iterator = list.iterator();

        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }

    }
}
