package com.github.mathan26.ds.array;
/*
    Given an integer array nums sorted in non-decreasing order, return an array of the squares
     of each number sorted in non-decreasing order.

    Input: nums = [-4,-1,0,3,10]
    Output: [0,1,9,16,100]
    Explanation: After squaring, the array becomes [16,1,0,9,100].
    After sorting, it becomes [0,1,9,16,100].
 */
public class SquaresofASortedArray {
    public int[] sortedSquares(int[] A) {
        int n = A.length;
        int[] result = new int[n];
        // Since the array already sorted , use the logic of two pointers.
        int i = 0, j = n - 1;
        // start from the last position, assign the value to the squared array.
        for (int p = n - 1; p >= 0; p--) {
            if (Math.abs(A[i]) > Math.abs(A[j])) {
                result[p] = A[i] * A[i];
                i++;
            } else {
                result[p] = A[j] * A[j];
                j--;
            }
        }
        return result;
    }
}
