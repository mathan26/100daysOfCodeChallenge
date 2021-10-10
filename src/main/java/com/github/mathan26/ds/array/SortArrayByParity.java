package com.github.mathan26.ds.array;

/*
        Given an integer array nums, move all the even integers at the beginning of the array followed by all the odd integers.

        Return any array that satisfies this condition.
        Input: nums = [3,1,2,4]
        Output: [2,4,3,1]
        Explanation: The outputs [4,2,3,1], [2,4,1,3], and [4,2,1,3] would also be accepted.
        */
public class SortArrayByParity {
    public int[] sortArrayByParity(int[] nums) {

        // Two pointers
        int i = 0; //begin
        int j = nums.length -1; //end

        while(i<j){
            if(nums[i]%2 > nums[j]%2){   //important: odd % 2 > even % 2
                //swap
                int temp = nums[i];
                nums[i] = nums[j];
                nums[j] = temp;
            }

            if(nums[i]%2==0)    //even
                i++; // good move the pointer
            if(nums[j]%2==1) //odd
                j--;  //reduce the end pointer
        }

        return nums;
    }
}
