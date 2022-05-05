package com.github.mathan26.concepts;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.HashMap;
import java.util.Map;

public class HashMapTest {

    // HashMap merge function example

  /*
    Here is how the merge() function works: If the specified key is not already associated with a value or the value is null, it associates the key with the given value.
    Otherwise, it replaces the value with the results of the given remapping function. If the result of the remapping function is null, it removes the result.
    */
    @Test
    public void mergeTest(){
        Map<Character, Integer> sMap = new HashMap<>();
        Map<Character, Integer> tMap = new HashMap<>();

        sMap.merge('A', 2, (v1, v2)->Integer.sum(v1,v2));
        sMap.merge('A', 1, Integer::sum); // method reference TODO: example add!
        sMap.merge('A', 1, Integer::sum);

        Assertions.assertEquals(4, sMap.get('A'));


    }
}
