package com.github.mathan26.ds.array.searching;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ValidMountainArrayTest {

    @Test
    public void  test(){
        ValidMountainArray mountainArray = new ValidMountainArray();
        boolean result = mountainArray.validMountainArray(new int[]{1,2,3,4,3,2,1});
        assertEquals(true, result);

        boolean result2 = mountainArray.validMountainArray(new int[]{6, 5, 4, 3, 2, 1});
        assertEquals(false, result2);

    }

}