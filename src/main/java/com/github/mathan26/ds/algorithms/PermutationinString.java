package com.github.mathan26.ds.algorithms;

/*
Given two strings s1 and s2, return true if s2 contains a permutation of s1, or false otherwise.

In other words, return true if one of s1's permutations is the substring of s2.

    Example 1:

    Input: s1 = "ab", s2 = "eidbaooo"
    Output: true
    Explanation: s2 contains one permutation of s1 ("ba").
*/
public class PermutationinString {
    public boolean checkInclusion(String s1, String s2) {

        int len1 = s1.length(), len2 = s2.length();
        // rule: not possible
        if (len1 > len2) return false;

        // allocate 26 space for lower case letters
        int[] count = new int[26];
        // first pass for both s1 and s2 and check all is zero.
        for (int i = 0; i < len1; i++) {
            count[s1.charAt(i) - 'a']++; // s1 add
            count[s2.charAt(i) - 'a']--; // s2 subtract
        }

        if (allZero(count))
            return true;

        for (int i = len1; i < len2; i++) {
            // window moving right subtract the count
            count[s2.charAt(i) - 'a']--;
            // window left out add the count
            count[s2.charAt(i - len1) - 'a']++;
            if (allZero(count))
                return true;
        }

        return false;
    }

    // if all index are zero, we can confirm s2 contains permutation of s1
    private boolean allZero(int[] count) {
        for (int i = 0; i < 26; i++) {
            if (count[i] != 0) return false;
        }
        return true;
    }
}
