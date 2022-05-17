package com.github.mathan26.ds.blind75.array_hashing;

import java.util.HashSet;

//Given an unsorted array of integers nums, return the length of the longest consecutive elements sequence.
//
//        You must write an algorithm that runs in O(n) time.
//
//
//
//        Example 1:
//
//        Input: nums = [100,4,200,1,3,2]
//        Output: 4
//        Explanation: The longest consecutive elements sequence is [1, 2, 3, 4]. Therefore its length is 4.
public class LongestConsecutiveSequenceLt128 {
    public int longestConsecutive(int[] nums) {

        // store all the array values to the set
        HashSet<Integer> set = new HashSet<>();

        int max = 0;

        for (int n : nums) {
            set.add(n);
        }

        for (int i = 0; i < nums.length; i++) {
            int current_num = nums[i];
            int current_seq = 1;
            // condition for only to execute start from the seq i.e should not have any left val
            if (!set.contains(current_num - 1)) {
                // check the seq exist or not by finding the next val in the set.
                while (set.contains(current_num + 1)) {
                    current_num += 1;
                    current_seq++;
                }
                //capture the max
                max = Math.max(max, current_seq);
            }

        }
        return max;

    }
}
