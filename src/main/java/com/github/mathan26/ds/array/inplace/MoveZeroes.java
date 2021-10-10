package com.github.mathan26.ds.array.inplace;

        /*
        Given an integer array nums, move all 0's to the end of it while maintaining the relative order of the non-zero elements.

        Note that you must do this in-place without making a copy of the array.
        Example 1:

        Input: nums = [0,1,0,3,12]
        Output: [1,3,12,0,0]
        */

public class MoveZeroes {

    public void moveZeroes(int[] nums) {
        // [0,1,0,3,12]

        int start = 0;
        int next = 0;

        while(next < nums.length){  // exit condition
            if(nums[next] == 0 ){  // important
                next++;  // just move the right pointer
            }else{
                //swap
                int temp = nums[start];
                nums[start] = nums[next];
                nums[next] = temp;

                // important: increment both pointers
                start++;
                next++;

            }

        }

    }
}
