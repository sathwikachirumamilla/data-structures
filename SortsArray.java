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
public class SortsArray {

    public static void sorting(int[] arr) {
        int low = 0, mid = 0, high = arr.length - 1;
        int pivot = 1;

        while (mid <= high) {
            if (arr[mid] > pivot) {
                int n = arr[high];
                arr[high] = arr[mid];
                arr[mid] = n;
                high--;
            } else if (arr[mid] < pivot) {
                int n = arr[low];
                arr[low] = arr[mid];
                arr[mid] = n;
                low++;
                mid++;
            } else {
                mid++;
            }
        }
    }

    public static void main(String[] args) {
        // sort an array of 0s,1s, 2s
        int[] arr = {2, 1, 1, 0, 1, 2, 1, 2, 0, 0, 0, 1};

        sorting(arr);

        System.out.println("sorting the array is " + Arrays.toString(arr));
    }

}
