package com.github.mathan26.ds.blind75.array_hashing;

import java.util.HashMap;
import java.util.Map;

public class ValidAnagram {
    public boolean isAnagram(String s, String t) {

        // it should be same length
        if (s.length() != t.length()) {
            return false;
        }

        // check same string
        if (s.equals(t)) return true;

        Map<Character, Integer> sMap = new HashMap<>();
        Map<Character, Integer> tMap = new HashMap<>();


        for (int i = 0; i < s.length(); i++) {
            // Merge function does the job
            sMap.merge(s.charAt(i), 1, Integer::sum);
            tMap.merge(t.charAt(i), 1, Integer::sum);
        }


        for (Character c : sMap.keySet()) {
            // only equals works! WEIRD!
            if (!sMap.get(c).equals(tMap.get(c))) return false;
        }

        return true;

    }
}
