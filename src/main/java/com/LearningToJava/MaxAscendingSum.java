package com.LearningToJava;

class MaxAscendingSum {
    public int maxAscendingSum(int[] nums) {
        int result = 0;
        int t = 0;

        for (int i = 0; i < nums.length; ++i) {
            if (i == 0 || nums[i] > nums[i - 1]) {
                t += nums[i];
                result = Math.max(result, t);
            } else {
                t = nums[i];
            }
        }

        return result;
    }
}
