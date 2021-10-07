package com.github.mathan26.ds.array;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MergeSortedArrayTest {

    @Test
    public void  test(){
        MergeSortedArray mergeSortedArray = new MergeSortedArray();
        int[] nums1 = {1, 2, 3, 0, 0, 0};
        mergeSortedArray.merge(nums1, 3, new int[] {2,5,6}, 3);
        assertArrayEquals(new int[]{1,2,2,3,5,6}, nums1);
    }
}