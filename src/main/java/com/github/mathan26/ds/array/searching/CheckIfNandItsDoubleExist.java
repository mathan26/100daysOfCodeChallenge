package com.github.mathan26.ds.array.searching;

import java.util.HashSet;
import java.util.Set;

public class CheckIfNandItsDoubleExist {
    public boolean checkIfExist(int[] arr) {
        Set<Integer> seen = new HashSet<>(); // to look up the values
        for(int i:arr){ // iterating the values
            if(seen.contains(2 * i) ||  i % 2==0 && seen.contains(i / 2)) // important: %2==0 for 7/2=3.5 but we get 3
                return true;
            seen.add(i); // add it to the hashset
        }

        return false;
    }
}
