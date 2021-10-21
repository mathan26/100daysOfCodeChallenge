package com.github.mathan26.ds.algorithms;
/*
3. Longest Substring Without Repeating Characters
    Given a string s, find the length of the longest substring without repeating characters.

    Input: s = "abcabcbb"
    Output: 3
    Explanation: The answer is "abc", with the length of 3.
*/
import java.util.HashSet;

public class LongestSubstringWithoutRepeatingCharacters {
    public int lengthOfLongestSubstring(String s) {
        int left = 0;
        int right = 0;
        int max = 0;

        // to hold the unique elements
        HashSet<Character> hashset = new HashSet<>();


        //sliding window technique
        while(right < s.length()){
            if(!hashset.contains(s.charAt(right))) {
                hashset.add(s.charAt(right));
                right++;
                // track the max up to current position
                max = Math.max(hashset.size(), max);
            }else {
                //remove the left point, and increase the left position
                hashset.remove(s.charAt(left));
                left++;
            }
        }

        return max;
    }
}
