package com.github.mathan26.ds.array.inplace;
/*
        1299. Replace Elements with Greatest Element on Right Side

        Given an array arr, replace every element in that array with the greatest element among the elements to its right, and replace the last element with -1.

        After doing so, return the array.
        Input: arr = [17,18,5,4,6,1]
        Output: [18,6,6,6,1,-1]

        Input: arr = [400]
        Output: [-1]
        Explanation: There are no elements to the right of index 0.
        */

public class ReplaceEleGreatestAtRight {
    public int[] replaceElements(int[] arr) {

        int max = -1;  // important read the problem statement
        int n = arr.length;

        for(int i = n -1 ; i >= 0; i--) {  // reverse iteration
            int temp = arr[i];
            arr[i] = max;  // asign the max in place
            max = Math.max(max, temp);  // keep track of the max

        }
        return arr;
    }
}
