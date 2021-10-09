package com.github.mathan26.ds.array;

public class RemoveDuplicatesFromSortedArray {
    public int removeDuplicates(int[] nums) {
        int left = 1; // initialize to 1 because start checking from index 1
        for(int right=1; right<nums.length; right++){
            if(nums[right-1] !=nums[right]){  // since this is in increasing order check the prev index with current index
                nums[left] = nums[right];    // put the current value point at the left position
                left +=1;                    // important: increase the left
            }
        }

        return left; // this will return the index up to there is no duplicate values.
    }
}
