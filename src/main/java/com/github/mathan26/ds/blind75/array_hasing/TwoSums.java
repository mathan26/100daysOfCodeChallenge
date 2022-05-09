package com.github.mathan26.ds.blind75.array_hasing;

import java.util.HashMap;
import java.util.Map;

public class TwoSums {
    public int[] twoSum(int[] nums, int target) {

        // [2,7,11,15]
        // target 9
        // a + b =result
        // b = result - a;

        int[] result = new int[2];
        Map<Integer, Integer> map = new HashMap<Integer, Integer>();


        for (int i = 0; i < nums.length; i++) {
            // target - currentIndex value present or not
            if (map.containsKey(target - nums[i])) { //key check
                result[0] = map.get(target - nums[i]);
                result[1] = i;
                return result;
            }
            map.put(nums[i], i); // Note, put the nums[i] and the index
        }

        return result;
    }
}
