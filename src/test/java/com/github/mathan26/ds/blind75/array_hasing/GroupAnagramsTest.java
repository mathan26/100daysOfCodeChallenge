package com.github.mathan26.ds.blind75.array_hasing;

import com.github.mathan26.ds.blind75.array_hashing.GroupAnagrams;
import org.junit.jupiter.api.Test;

import java.util.List;

class GroupAnagramsTest {

    @Test
    void checkGroupAnagram() {
        GroupAnagrams groupAnagrams = new GroupAnagrams();

        String[] input =new String[] {"eat","tea","tan","ate","nat","bat"};
        List<List<String>> lists = groupAnagrams.groupAnagrams(input);
        //TODO: add assertion: create multi dimensional
    }
}