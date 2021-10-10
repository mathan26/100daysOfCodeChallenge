package com.github.mathan26.ds.array;

import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.*;

class SortArrayByParityTest {
    @Test
    void test() {
        SortArrayByParity sortArrayByParity = new SortArrayByParity();
        int[] input = { 3,1,2,4 };
        sortArrayByParity.sortArrayByParity(input);
        assertArrayEquals(new int[]{4, 2, 1, 3},input);
    }
}