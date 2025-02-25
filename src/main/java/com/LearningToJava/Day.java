package com.LearningToJava;

public enum Day {
    MONDAY {
        @Override
        public String toString() {
            return super.toString();
        }

        public void time(){
            System.out.println("ПОНЕДЕЛЬНИК");
        }
    }

    , TUESDAY, WEDNESDAY, THURSDAY, FRIDAY, SATURDAY, SUNDAY
}
