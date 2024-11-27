package com.learning.leetcode.easy;

import java.util.Arrays;
import java.util.HashMap;

/**
 * Author fei
 * Version 1.0
 * Description TODO
 * DATA 2024/11/24  22:27
 */
public class TowSum {
    public static void main(String[] args) {
        int[] nums = {1, 2, 3, 5, 5};
        int target = 6;
        System.out.println(Arrays.toString(twoSum(nums, target)));
    }


    public static int[] twoSum(int[] nums, int target){
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            int complement = target - nums[i];
            if (map.containsKey(complement)) {
                return new int[]{map.get(complement), i};
            }
            map.put(nums[i], i);
        }
        return new int[0];
    }
}
