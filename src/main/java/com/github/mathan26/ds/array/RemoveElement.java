package com.github.mathan26.ds.array;

/*
        Input: nums = [3,2,2,3], val = 3
        Output: 2, nums = [2,2,_,_]
        Explanation: Your function should return k = 2, with the first two elements of nums being 2.
        It does not matter what you leave beyond the returned k (hence they are underscores).
        */
public class RemoveElement {
    public int removeElement(int[] nums, int val) {
        int k = 0; // this pointer keeps tracks the removing value index
        for(int i = 0; i < nums.length ; i++){
            if(nums[i] != val){   // important just check the non-equal value
                nums[k] = nums[i]; // swap
                k +=1;  // increase the pointer to next positon
            }
        }

        return k; // this pointer holds the value, i.e equal to removing val

    }
}
