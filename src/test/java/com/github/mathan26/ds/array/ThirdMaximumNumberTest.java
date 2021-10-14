package com.github.mathan26.ds.array;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ThirdMaximumNumberTest {

    @Test
    void thirdMax() {
        ThirdMaximumNumber thirdMaximumNumber = new ThirdMaximumNumber();
        int result = thirdMaximumNumber.thirdMax(new int[]{1,2,3});
        assertEquals(1, result);
    }
}