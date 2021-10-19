package com.github.mathan26.ds.algorithms;

/*
167. Two Sum II - Input array is sorted
*/
public class TwoSumII {
    public int[] twoSum(int[] numbers, int target) {

        // store the result
        int[] result = new int[2];
        //two pointers
        int left = 0;
        int right = numbers.length - 1;

        while(left < right) {
            int l = numbers[left];
            int r = numbers[right];

            if((l+r) == target) {
                result[0] = left + 1;
                result[1] = right + 1;
                break;
            }else if( (l+r) < target) { // if the target is greater since the array is sorted,
                left++;                 // move the left pointer to next position.
            }else{
                right--;  // if target is less reduce the right pointer
            }
        }

        return result;

    }
}
