package com.github.mathan26.ds.algorithms;

public class SearchInsertPosition {
    public int searchInsert(int[] nums, int target) {
        int left  = 0;
        int right = nums.length - 1;

        while(left <= right) {
            int mid = (left + right) / 2;

            if(nums[mid] == target){
                return mid;
            }

            if(nums[mid] < target){ // note the condition
                left = mid + 1;
            }else{
                right = mid -1;
            }


        }
        return left; // return left this works for all the condition
    }
}
