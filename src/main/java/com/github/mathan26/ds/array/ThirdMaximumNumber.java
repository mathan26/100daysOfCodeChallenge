package com.github.mathan26.ds.array;

    /*
        Given an integer array nums, return the third distinct maximum number in this array.
        If the third maximum does not exist, return the maximum number.

        Input: nums = [3,2,1]
        Output: 1
        Explanation:
        The first distinct maximum is 3.
        The second distinct maximum is 2.
        The third distinct maximum is 1.

      */
public class ThirdMaximumNumber {
        public int thirdMax(int[] nums) {

            Integer  max = null;
            Integer secondMax = null;
            Integer thirdMax = null;

            for(Integer num: nums){ // Used integer

                if(num.equals(max) || num.equals(secondMax) || num.equals(thirdMax)){ // skip if num is equal
                    continue;
                }

                // Just pretty stright forward logic just swap before assign the values
                if(max == null || num > max){
                    thirdMax = secondMax;
                    secondMax = max;
                    max = num;
                }else if(secondMax == null || num > secondMax){
                    thirdMax = secondMax;
                    secondMax = num;
                }else if(thirdMax == null || num > thirdMax){
                    thirdMax = num;
                }
            }

            if(thirdMax == null){  // if the third max not exists then return the max
                return max;
            }

            return thirdMax;

        }

}
