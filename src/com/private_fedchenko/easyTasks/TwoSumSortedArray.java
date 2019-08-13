package com.private_fedchenko.easyTasks;

//Given an array of integers that is already sorted in ascending order,
//find two numbers such that they add up to a specific target number.
//The function TwoSum should return indices of the two numbers such
//that they add up to the target, where index1 must be less than index2.

//         NOTE:
//Your returned answers (both index1 and index2) are not zero-based.
//You may assume that each input would have exactly one solution and you may not use the same element twice.

//worst case complexity for twoSumSortedArraySolution ideally:              O(n)
//worst case complexity for twoSumSortedArraySolution method IN MY ALGO:    O(n)

import com.private_fedchenko.ElapsedTime;

public class TwoSumSortedArray {

    public static ElapsedTime elapsedTime = new ElapsedTime();

    public static void main(String[] args) {
        int[] testArray = {-45, -34, -2, 0, 1, 3, 5, 7, 9, 11, 55}; //target 11
        int[] testArray2 = {2, 7, 11, 15}; //target 9
        int[] resultArray;
        elapsedTime.saveStartTime();
        resultArray = twoSumSortedArraySolution(testArray2, 9);
        elapsedTime.saveEndTime();
        elapsedTime.measureElapsedTime();
        System.out.println("Indices: ");
        for (int i = 0; i < resultArray.length; i++) {
            System.out.print(resultArray[i] + " ");
        }
        System.out.println();
        System.out.println("Elapsed time " + elapsedTime.getElapsedTime() + " ms");
    }

    public static int[] twoSumSortedArraySolution(int[] nums, int target) {
        if (nums.length < 2) {
            throw new IllegalArgumentException("No two sum solution");
        }
        int startP = 0;
        int endP = nums.length - 1;

        while (startP < endP) {
            if (nums[startP] + nums[endP] == target) {
                return new int[]{startP+1, endP+1};   //indices are not zero based
            } else if (nums[startP] + nums[endP] > target) {
                endP--;
            } else {
                startP++;
            }
        }

        throw new IllegalArgumentException("No two sum solution");
    }
}
