package com.LearningToJava.practice;

public class Bell {
    Boolean ding = true;

    public void sound() {
        if (ding) {
            System.out.println("ding");
        }

        if (!ding) {
            System.out.println("dong");
        }

        ding = !ding;
    }
}
