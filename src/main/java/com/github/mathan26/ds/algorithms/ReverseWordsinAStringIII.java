package com.github.mathan26.ds.algorithms;
/*
557. Reverse Words in a String III
Given a string s, reverse the order of characters in each word within a sentence while still preserving whitespace and initial word order.

Example 1:

Input: s = "Let's take LeetCode contest"
Output: "s'teL ekat edoCteeL tsetnoc"
*/
public class ReverseWordsinAStringIII {
    public String reverseWords(String s) {

        char[] c = s.toCharArray();
        int left = 0;
        for(int right = 0; right< s.length(); right++){

            if(c[right] == ' '){
                reverse(c, left, right-1);
                left = right + 1; // move the left pointer to right poiting position
            }
        }
        reverse(c, left, c.length - 1); // after space still there are some words are there.
        return new String(c);

    }

    // same logic as like to reverse a string, here left and right are passed dynamically
    public void reverse(char[] s, int left, int right) {

        while(left <  right){
            char temp = s[left];
            s[left] = s[right];
            s[right] = temp;
            left++;
            right--;
        }
    }

}
