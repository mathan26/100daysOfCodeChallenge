package com.github.mathan26.ds.blind75.array_hashing;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/*Given an array of strings strs, group the anagrams together. You can return the answer in any order.

        An Anagram is a word or phrase formed by rearranging the letters of a different word or phrase, typically using all the original letters exactly once.



        Example 1:

        Input: strs = ["eat","tea","tan","ate","nat","bat"]
        Output: [["bat"],["nat","tan"],["ate","eat","tea"]]
        Example 2:

        Input: strs = [""]
        Output: [[""]]
        Example 3:

        Input: strs = ["a"]
        Output: [["a"]]*/
public class GroupAnagrams {
    public List<List<String>> groupAnagrams(String[] strs) {

        Map<String, List<String>> map = new HashMap<>();
        for (String str : strs) {
            //to reduce the sorting operation
            // Note: create a char array
            char[] ca = new char[26];
            for (char c : str.toCharArray()) {
                ca[c - 'a']++;
            }
            String keyStr = String.valueOf(ca);

            if (!map.containsKey(keyStr)) {
                map.put(keyStr, new ArrayList<>());
            }
            // add the str to the existing list
            map.get(keyStr).add(str);
        }

        return new ArrayList<>(map.values());
    }

}
