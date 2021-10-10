package com.github.mathan26.ds.array.inplace;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ReplaceEleGreatestAtRightTest {

    @Test
    void test() {
        ReplaceEleGreatestAtRight replaceEleGreatestAtRight = new ReplaceEleGreatestAtRight();
        int[] result = replaceEleGreatestAtRight.replaceElements(new int[]{17,18,5,4,6,1});
        assertArrayEquals(new int[]{18,6,6,6,1,-1}, result);
    }
}