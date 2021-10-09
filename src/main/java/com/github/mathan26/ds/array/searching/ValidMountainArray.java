package com.github.mathan26.ds.array.searching;

public class ValidMountainArray {
    public boolean validMountainArray(int[] arr) {

        if(arr.length<3)   // base condition
            return false;
        int i= 0;

        for(;i<arr.length-1;i++){  // first check the increasing order
            if(arr[i]>arr[i + 1]){
                i++;
                break; // time to check on the decreasing side
            }

            if(arr[i] == arr[i + 1])  // both value is same return false
                return false;
        }
        if(i < 2)                // boundary case 4 3 2 1  this case result is fasle
            return false;

        for(;i<arr.length;i++){
            if(arr[i-1] <= arr[i])
                return false;
        }
        return true;
    }
}
