package com.github.mathan26.ds.array.inplace;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MoveZeroesTest {
    @Test
    void test() {
        MoveZeroes moveZeroes = new MoveZeroes();
        int[]  input = new int[]{ 0, 1, 2, 0, 3 };
        moveZeroes.moveZeroes(input);
        assertArrayEquals(new int[]{1, 2 , 3, 0, 0},input);
    }
}