/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package logic.solutions.arrays;

/**
 *
 * @author SujanChirumamilla
 */
public class JumpGame {

    public static int jumpCount(int[] nums) {

        int a = nums[0];
        int b = nums[0];
        int i = 0;
        int jumps = 1;

        for (i = 1; i < nums.length; i++) {
            if (i == nums.length - 1) {
                return jumps;
            }
            a--;
            b--;
            if (nums[i] > b) {
                b = nums[i];
            }
            if (a == 0) {
                jumps++;
                a = b;
            }
        }

        return jumps;
    }

    public static void main(String[] args) {

        // Jump Game Problem
        int[] arr = {1, 3, 5, 1, 2, 2, 6, 7, 6, 8, 9, 1,3};

        System.out.println("no of jumps are " + jumpCount(arr));

    }
}
