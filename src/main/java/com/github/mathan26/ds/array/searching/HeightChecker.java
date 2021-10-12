package com.github.mathan26.ds.array.searching;

import java.util.Arrays;

public class HeightChecker {
    public int heightChecker(int[] heights) {
        int[] sortedArray = heights.clone(); // clone the copy

        Arrays.sort(sortedArray); // sort the array

        int count = 0;
        for(int i=0; i<heights.length;i++){
            if(sortedArray[i] != heights[i]){ //if it is not equal then not in the correct order
                count++;   // increase the count
            }
        }

        return count;
    }
}
