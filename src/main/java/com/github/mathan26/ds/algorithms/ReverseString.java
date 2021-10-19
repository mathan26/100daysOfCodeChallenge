package com.github.mathan26.ds.algorithms;
/*
    344. Reverse String
    Write a function that reverses a string. The input string is given as an array of characters s.

    Input: s = ["H","a","n","n","a","h"]
    Output: ["h","a","n","n","a","H"]

    Follow up: Do not allocate extra space for another array. You must do this by modifying the input array in-place with O(1) extra memory.

*/
public class ReverseString {
    public void reverseString(char[] s) {
        int left = 0;
        int right = s.length - 1;

        while(left <  right){
            // swap that gives O(log n)
            char temp = s[left];
            s[left] = s[right];
            s[right] = temp;

            //increase the left, decrease the right
            left++;
            right--;
        }
    }
}
