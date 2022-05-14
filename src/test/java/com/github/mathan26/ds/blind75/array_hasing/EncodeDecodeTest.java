package com.github.mathan26.ds.blind75.array_hasing;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class EncodeDecodeTest {

    @Test
    void test() {
        EncodeDecode encodeDecode = new EncodeDecode();
        List<String> s= Arrays.asList("Software", "Engineer");

        List<String> decodeString = encodeDecode.decode(encodeDecode.encode(s));
//        https://stackoverflow.com/questions/4042434/converting-arrayliststring-to-string-in-java
        Assertions.assertArrayEquals(s.stream().toArray(), decodeString.stream().toArray()); // TODO: object compare only allowed
    }
}