package com.LearningToJava.solid;

public class Main {
    public static void main(String[] args) {

        MotherBoard mb = new MotherBoard();
        System.out.println("Total Ports = " + mb.usb.getTotalPorts());
    }
}
