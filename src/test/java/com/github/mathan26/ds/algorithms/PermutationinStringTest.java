package com.github.mathan26.ds.algorithms;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PermutationinStringTest {

    @Test
    void checkInclusion() {
        String s1 = "ab";
        String s2 = "cba";

        PermutationinString permutationinString = new PermutationinString();
        boolean result = permutationinString.checkInclusion(s1, s2);
        assertTrue(result);

    }
}