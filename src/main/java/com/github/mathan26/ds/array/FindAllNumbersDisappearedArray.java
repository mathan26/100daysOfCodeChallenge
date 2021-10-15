package com.github.mathan26.ds.array;

import java.util.ArrayList;
import java.util.List;

/*
        Given an array nums of n integers where nums[i] is in the range [1, n],
         return an array of all the integers in the range [1, n] that do not appear in nums.

         Input: nums = [4,3,2,7,8,2,3,1]
         Output: [5,6]
 */
public class FindAllNumbersDisappearedArray {
    public List<Integer> findDisappearedNumbers(int[] nums) {

        // note: n == sizeOftheelment and also the last element in the range
        for(int i = 0; i < nums.length; i++){
            int current = Math.abs(nums[i]); // assign iteration and get the index value
            nums[current - 1] = -(Math.abs(nums[current-1])); // negate the index
        }


        List<Integer> result = new ArrayList<>();
        for(int i = 0; i < nums.length; i++){

            if(nums[i] > 0){
                result.add(i+1); // note: i + 1 gives the missing value
            }
        }

        return result;
    }
}
