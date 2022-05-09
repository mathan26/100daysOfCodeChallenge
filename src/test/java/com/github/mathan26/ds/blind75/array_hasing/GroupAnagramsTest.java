package com.github.mathan26.ds.blind75.array_hasing;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class GroupAnagramsTest {

    @Test
    void checkGroupAnagram() {
        GroupAnagrams groupAnagrams = new GroupAnagrams();

        String[] input =new String[] {"eat","tea","tan","ate","nat","bat"};
        List<List<String>> lists = groupAnagrams.groupAnagrams(input);
        //TODO: add assertion: create multi dimensional
    }
}