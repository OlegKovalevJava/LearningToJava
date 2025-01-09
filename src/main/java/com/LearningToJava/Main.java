package com.LearningToJava;

import java.util.ArrayList;

public class Main {
    @SuppressWarnings("unchecked")
    public static void main(String[] args) {

        ArrayList<Gerbil> gerbils = new ArrayList<>();

        for (int i = 0; i < 4; i++) {
            gerbils.add(new Gerbil(i));
        }

        for (Gerbil gerbil : gerbils) {
            System.out.println(gerbil.gerbilNumber);
        }

        for (Gerbil c : gerbils) {
            c.hop();
        }
    }
}
