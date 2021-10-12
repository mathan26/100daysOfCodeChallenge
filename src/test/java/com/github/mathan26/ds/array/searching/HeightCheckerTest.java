package com.github.mathan26.ds.array.searching;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class HeightCheckerTest {

    @Test
    void test() {
        HeightChecker heightChecker = new HeightChecker();
        int result = heightChecker.heightChecker(new int[]{1,1,4,2,1,3});
        assertEquals(3, result);
    }
}