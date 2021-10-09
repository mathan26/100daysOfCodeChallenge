package com.github.mathan26.ds.array;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class RemoveDuplicatesFromSortedArrayTest {

    @Test
    public void test(){
        RemoveDuplicatesFromSortedArray removeDuplicatesFromSortedArray = new RemoveDuplicatesFromSortedArray();
        int result =  removeDuplicatesFromSortedArray.removeDuplicates(new int[]{0,0,1,1,1,2,2,3,3,4});
        assertEquals(5, result);
    }

}