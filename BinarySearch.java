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
public class BinarySearch {

    public static int binarySearch(int[] arr, int key, int start, int end) {

        // basic condition
        if (start > end) {
            return -1;
        }
        int mid = start + ((end - start) / 2);
        if (arr[mid] == key) {
            return mid;
        } else if (arr[mid] > key) {
            return binarySearch(arr,key,start, mid -1);
        } else  {
          return binarySearch(arr,key,mid+1, end);
        }
    }

    public static void main(String[] args) {
        // find max value in an arry increasing and decreasing  using binary search
        int[] arr = {1, 13, 15, 18, 24, 29, 55, 99, 125, 143, 159};
        
        System.out.println("the index of 125 is " + binarySearch(arr, 150, 0, arr.length-1));
    }

}
