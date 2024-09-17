package com.LearningToJava.tank;

public class SuperAmphibianTank extends AmphibianTank{

    int a = 2;


    public void test() {

        System.out.println(getA());
        System.out.println(a);
        System.out.println(super.a);

    }

}
