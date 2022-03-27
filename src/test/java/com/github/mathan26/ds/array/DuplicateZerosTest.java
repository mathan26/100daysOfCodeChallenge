package com.github.mathan26.ds.array;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class DuplicateZerosTest {

    @Test
    public  void test(){
        int[] input = {1,0,2,3,0,4,5,0};
        DuplicateZeros duplicateZeros = new DuplicateZeros();
        duplicateZeros.duplicateZeros(input);
        Assertions.assertArrayEquals(new int[]{1, 0, 0, 2, 3, 0, 0, 4},input);

    }

    @Test
    public  void testEdgeCase() {
        int[] input = {1,0,0, 1};
        DuplicateZeros duplicateZeros = new DuplicateZeros();
        duplicateZeros.duplicateZeros(input);
        Assertions.assertArrayEquals(new int[]{1, 1, 0},input);

    }
}