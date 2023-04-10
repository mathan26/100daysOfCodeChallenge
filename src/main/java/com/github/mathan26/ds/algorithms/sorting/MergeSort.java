package com.github.mathan26.ds.algorithms.sorting;


import java.util.Arrays;

public class MergeSort {
    public static void main(String[] args) {
        /*
        * 1. Divide the list into two sublist
        *    * stop when reaches to 1
        * 2. Sort the sublist
        * 3. Merge the sublist
        *
        * */


        int[] arr = { 15, 5, 24, 9, 1, 3, 16, 10, 20};
        System.out.println("Before Sorting " +Arrays.toString(arr));
        sortArray(arr, 0, arr.length - 1);
        System.out.println("After Sorting " +Arrays.toString(arr));


    }

    private static void sortArray(int[] arr, int left, int right) {

        if( left < right) {
            int middle = left + (right - left) / 2;

            sortArray(arr, left, middle);
            sortArray(arr, middle + 1, right);
            merge(arr, left, middle, right);
        }

    }

    private static void merge(int[] arr, int left, int middle, int right) {

        // Find the sizes of two sub arrays to be merged

        int n1 = middle - left + 1;
        int n2 = right - middle;

        // create temp array

        int L[] = new int[n1];
        int R[] = new int[n2];

        // copy the data to temp arrays

        for (int i = 0; i < n1; i++) {
            L[i] = arr[left + i];
        }

        for (int j = 0; j < n2; j++) {
            R[j] = arr[middle + 1 + j];
        }

//        Merge the temp  arrays

//        Initial indexes of first and second subarrays
        int i = 0, j =0;


        // Initial index of merged subarray array
        int k = left;
        while (i < n1 && j < n2) {
            if (L[i] <= R[j]) {
                arr[k] = L[i];
                i++;
            }
            else {
                arr[k] = R[j];
                j++;
            }
            k++;
        }

        /* Copy remaining elements of L[] if any */
        while (i < n1) {
            arr[k] = L[i];
            i++;
            k++;
        }

        /* Copy remaining elements of R[] if any */
        while (j < n2) {
            arr[k] = R[j];
            j++;
            k++;
        }



    }
}
