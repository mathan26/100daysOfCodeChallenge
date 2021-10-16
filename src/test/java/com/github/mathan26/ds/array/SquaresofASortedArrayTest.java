package com.github.mathan26.ds.array;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SquaresofASortedArrayTest {

    @Test
    void sortedSquares() {
        SquaresofASortedArray squaresofASortedArray = new SquaresofASortedArray();
        int[] result = squaresofASortedArray.sortedSquares(new int[]{-4,-1,0,3,10});
        assertArrayEquals(new int[]{0,1,9,16,100}, result);
    }
}