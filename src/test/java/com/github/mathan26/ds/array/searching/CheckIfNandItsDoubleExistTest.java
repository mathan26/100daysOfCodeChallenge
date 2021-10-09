package com.github.mathan26.ds.array.searching;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CheckIfNandItsDoubleExistTest {

    @Test
    public void testTruecondition(){
        CheckIfNandItsDoubleExist doubleExist = new CheckIfNandItsDoubleExist();
        boolean result = doubleExist.checkIfExist(new int[]{1,2,3});
        assertEquals(true, result);

    }

    @Test
    public void testFalsecondition(){
        CheckIfNandItsDoubleExist doubleExist = new CheckIfNandItsDoubleExist();
        boolean result = doubleExist.checkIfExist(new int[]{1,4,16});
        assertEquals(false, result);

    }

}