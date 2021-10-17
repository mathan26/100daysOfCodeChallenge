package com.github.mathan26.ds.algorithms;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SearchInsertPositionTest {

    @Test
    void searchInsert() {
        SearchInsertPosition searchInsertPosition = new SearchInsertPosition();
        int result = searchInsertPosition.searchInsert(new int[]{1,2,3},3);
        assertEquals(result, 2);
    }
}