package com.private_fedchenko.mediumTasks;

import com.private_fedchenko.ElapsedTime;


//Given n non-negative integers a1, a2, ..., an , where each represents a point at coordinate (i, ai).
// n vertical lines are drawn such that the two endpoints of line i is at (i, ai) and (i, 0).
// Find two lines, which together with x-axis forms a container, such that the container contains the most water.
//
//      Note: You may not slant the container and n is at least 2.

//worst case complexity for ContainerWithMostWater  ideally:      O(n)
//worst case complexity for ContainerWithMostWater IN MY ALGO:    O(n)


public class ContainerWithMostWater {

    public static ElapsedTime elapsedTime = new ElapsedTime();

    public static void main(String[] args) {
        int[] testArray = {1, 2, 4, 2, 1, 6, 0, 9}; //4x5=20: 4 and 9
        elapsedTime.saveStartTime();

        int result = maxArea(testArray);

        elapsedTime.saveEndTime();
        elapsedTime.measureElapsedTime();

        System.out.println("maxArea is " + result);
        System.out.println();
        System.out.println("Elapsed Time " + elapsedTime.getElapsedTime() + " ms");
    }

    public static int maxArea(int[] height) {
        int result = 0;
        int leftHeight = 0;
        int rightHeight = height.length - 1;

        while (leftHeight < rightHeight) {
            int tempRes = Math.min(height[leftHeight], height[rightHeight]) * Math.abs(rightHeight - leftHeight);
            result = result < tempRes ? tempRes : result;
            if (height[leftHeight] > height[rightHeight]) {
                rightHeight--;
            } else {
                leftHeight++;
            }

        }
        return result;
    }
}
