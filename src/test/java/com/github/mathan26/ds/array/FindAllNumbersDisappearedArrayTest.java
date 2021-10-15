package com.github.mathan26.ds.array;

import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class FindAllNumbersDisappearedArrayTest {

    @Test
    public void test(){
        FindAllNumbersDisappearedArray obj = new FindAllNumbersDisappearedArray();
        List<Integer> result = obj.findDisappearedNumbers(new int[]{4,3,2,7,8,2,3,1});
        assertArrayEquals(new Integer[]{5, 6}, result.stream().toArray(Integer[]::new));

    }

}