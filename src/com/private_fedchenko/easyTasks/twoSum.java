package com.private_fedchenko.easyTasks;

//Given an array of integers, return indices of the two numbers such that they add up to a specific target.
//You may assume that each input would have exactly one solution, and you may not use the same element twice

//worst case complexity for twoSumSolution ideally:              O(n)
//worst case complexity for twoSumSolution method IN MY ALGO:    O(n)

import com.private_fedchenko.ElapsedTime;

import java.util.HashMap;
import java.util.Map;

public class twoSum {

    public static ElapsedTime elapsedTime = new ElapsedTime();

    public static void main(String[] args) {
        int[] testArray = {1, 0, 2, -1, -3, 5, -4};
        elapsedTime.saveStartTime();

        int[] resultList = twoSum(testArray, 2);

        elapsedTime.saveEndTime();
        elapsedTime.measureElapsedTime();
        for (int i = 0; i < resultList.length; i++) {
            System.out.println(resultList[i]);
        }
        System.out.println("Elapsed time " + elapsedTime.getElapsedTime() + " ms");

    }

    public static int[] twoSum(int[] nums, int target) {
        if (nums.length < 2) {
            return new int[]{};
        }
        Map<Integer, Integer> map = new HashMap<Integer, Integer>();
        for (int i = 0; i < nums.length; i++) {
            int compl = target - nums[i];
            if (map.containsKey(compl)) {
                return new int[]{i, map.get(compl)};
            }
            map.put(nums[i], i);
        }

        throw new IllegalArgumentException("No two sum solution");
    }
}
