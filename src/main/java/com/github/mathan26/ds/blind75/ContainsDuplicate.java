package com.github.mathan26.ds.blind75;

import java.util.HashSet;

/*
Given an integer array nums, return true if any value appears at least twice in the array, and return false if every element is distinct.
        Example 1:

        Input: nums = [1,2,3,1]
        Output: true
        Example 2:

        Input: nums = [1,2,3,4]
        Output: false
        Example 3:

        Input: nums = [1,1,1,3,3,4,3,2,4,2]
        Output: true

        */
public class ContainsDuplicate {
    public boolean containsDuplicate(int[] nums) {

        // We can use the hashing technique
        HashSet<Integer> set = new HashSet<Integer>();

        for(int num:nums){
            // check condition
            if(set.contains(num)){
                // if num is already added, then we know it contains duplicate.
                return true;
            }

            // if num not present, add the value to the set.
            // Set don't accept the duplicate.
            set.add(num);
        }

        return false;

    }
}
