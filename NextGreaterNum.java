/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package logic.solutions.arrays;

import java.util.Arrays;

/**
 *
 * @author SujanChirumamilla
 */
public class NextGreaterNum {

    public static void nextGreaterNum(char[] nums) {
        int i = nums.length - 1;

        for (i = nums.length - 1; i > 0; i--) {
            if (nums[i] > nums[i - 1]) {
                break;
            }
        }

        if (i == 0) {
            System.out.println("the next greater number is not possible");
        } else {
            char smallest = nums[i];
            int smallestIndex = i;
            for (int n = i + 1; n < nums.length; n++) {
                if (nums[n] < smallest) {
                    smallest = nums[n];
                    smallestIndex = n;
                }
            }
            swap(nums, i - 1, smallestIndex);
            Arrays.sort(nums, i, nums.length);

            System.out.println("the char is " + Arrays.toString(nums));

        }
    }

    private static void swap(char[] nums, int i, int j) {
        char temp = nums[i];
        nums[i] = nums[j];
        nums[j] = temp;
    }

    public static void main(String[] args) {
        // Write an algorithm to find out next greater number to given number with the same set of digits 
        // 218765 ---> 251678
        // 12345 ---> 54321
        String str = "28775";
        char[] ch = str.toCharArray();
        nextGreaterNum(ch);

    }
}
