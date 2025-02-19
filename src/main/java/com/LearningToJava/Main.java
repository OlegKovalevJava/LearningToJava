package com.LearningToJava;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {

        TwoSum twoSum = new TwoSum();
        int[] nums = {2, 3, 3, 2};
        System.out.println(Arrays.toString(twoSum.twoSum(nums, 10)));

    }
}
