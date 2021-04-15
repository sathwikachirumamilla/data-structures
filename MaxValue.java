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
public class MaxValue {

    public static int findMaxValue(int[] arr, int start, int end) {

        // if array length is equal to 1
        if (start == end) {
            return arr[start];
        }
        // if array length is equal to 2
        if (end == start + 1) {

            if (arr[start] > arr[end]) {
                return arr[start];
            } else {
                return arr[end];
            }
        }

        int mid = start + ((end - start) / 2 >> 1);

        // left side is less and right side is less then return mid element
        if (arr[mid - 1] < arr[mid] && arr[mid + 1] < arr[mid]) {
            return arr[mid];
        } else if (arr[mid-1] < arr[mid] && arr[mid+1] > arr[mid]) { // left side is less and right is more then  right
            return findMaxValue(arr,mid+1, end);
        } else {  // less side is more and right side is less then call left side
             return findMaxValue(arr,start,mid-1);
        }
    }

    public static void main(String[] args) {
        int[] arr = {6, 9, 15, 25, 35, 50, 78,90, 888,41, 29, 23, 8};
        
        System.out.println("the maximum value is "+ findMaxValue(arr, 0, arr.length-1));

    }

}
