package com.github.mathan26.ds.array;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class RemoveElementTest {
    @Test
    public void test(){
        RemoveElement removeElement = new RemoveElement();
        int result = removeElement.removeElement(new int[]{3, 2, 2, 3}, 2);
        assertEquals(2, result);
    }
}