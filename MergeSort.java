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
public class MergeSort {

    public static void mergeSort(int[] arr, int[] result, int low, int high) {

        // basic condition
        if (low >= high) {
            return;
        }
        int mid = low + ((high - low) >> 1);

        mergeSort(arr, result, low, mid);  // first half arr
        mergeSort(arr, result, mid + 1, high); // second second half arr;

        merge(arr, result, low, mid, high);  // merge procedure

    }

    public static void merge(int[] arr, int[] result, int low, int mid, int high) {
        int k = low, i = low, j = mid + 1;

        while (i <= mid && j <= high) {
            if (arr[i] <= arr[j]) {
                result[k++] = arr[i++];
            } else {
                result[k++] = arr[j++];
            }
        }

        while (i <= mid) {
            result[k++] = arr[i++];
        }

        for (i = low; i <= high; i++) {
            arr[i] = result[i];
        }
    }

    public static void main(String[] args) {
        // TODO code application logic here
        int[] arr = {8, 4, 3, 12};
        int[] result = Arrays.copyOf(arr, arr.length);

        MergeSort.mergeSort(arr, result, 0, arr.length - 1);

        System.out.println("the sort array is " + Arrays.toString(result));

    }
}
