package com.github.mathan26.ds.blind75.array_hasing;

/*
        Given an integer array nums, return an array answer such that answer[i] is equal to the product of all the elements of nums except nums[i].

        The product of any prefix or suffix of nums is guaranteed to fit in a 32-bit integer.

        You must write an algorithm that runs in O(n) time and without using the division operation.



        Example 1:

        Input: nums = [1,2,3,4]
        Output: [24,12,8,6]
        Example 2:

        Input: nums = [-1,1,0,-3,3]
        Output: [0,0,9,0,0]
        */


// prefix sum and postfix sum
public class ProductofArrayExceptSelf {
    public int[] productExceptSelf(int[] nums) {
        int size=nums.length;
        int[] output = new int[size];
        // set it to one, before there is no value
        int product=1;

        // calculate prefix sum
        for(int i=0;i<size;i++){
            product *=nums[i];
            // replace the value in place
            output[i]=product;
        }

        product=1;

        // calculate postfix
        for(int i=size-1;i>0;i--){
            output[i]=output[i-1]*product;
            product *=nums[i];
        }
        // note
        output[0]=product;

        return output;
    }
}
