package com.github.mathan26.ds.array;

/*
Given an array of integers and an integer k, you need to find
the total number of continuous subarrays whose sum equals to k.
Example 1:
Input:nums = [1,1,1], k = 2
Output: 2
Note:
The length of the array is in range [1, 20,000].
The range of numbers in the array is [-1000, 1000] and the range of the integer k is [-1e7, 1e7].
 */

/**
 * Approach: PreSum + HashMap
 * We still introduce preSum to optimize our time complexity and store it in the map.
 * According to the requirements of the title, here the key is preSum, and the value is the number of occurrences of preSum (because we require the number of times, not the length).
 * When map.containsKey(preSum-k), it means that the value of map.get(preSum-k) k has been accumulated before i.
 * Therefore count += map.get(preSum-k).
 * At the same time, preSum and its corresponding index are added to the map.
 * Notice:
 * The initialization of map here is (0, 1) which means that when a number is not added, preSum is 0 and it has appeared once.
 * (For the initialization of map and other parameters, all must be based on the subject requirements)
 *
 * The time complexity is: O(n)
 * The space complexity: O(n)
 *
 * More Methods: https://leetcode.com/problems/subarray-sum-equals-k/solution/
 */

import java.util.HashMap;

public class SubarraySumEqualsK {
    public int subarraySum(int[] nums, int k) {
        int length  = nums.length;
        if(length == 0)
            return -1;

        HashMap<Integer, Integer> map = new HashMap<>(); // presum as key , value as presum count
        map.put(0,1); // important

        int preSum = 0; // initially presum is zero
        int count  = 0;

        for(int i = 0; i < nums.length; i++){
            preSum += nums[i];  // calculate the presum while iterating through each element
            if(map.containsKey(preSum-k)){ // presum - k = value that mean if value is present before there must be sub array
                count +=map.get(preSum-k); // increase the count
            }

            map.put(preSum, map.getOrDefault(preSum,0)+1); // important getOrDefault
        }

        return count;
    }
}
