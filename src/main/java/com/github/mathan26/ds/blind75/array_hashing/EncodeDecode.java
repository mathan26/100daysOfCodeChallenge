package com.github.mathan26.ds.blind75.array_hashing;
//https://cheonhyangzhang.gitbooks.io/leetcode-solutions/content/271-encode-and-decode-strings.html

import java.util.ArrayList;
import java.util.List;

public class EncodeDecode {

        public String encode(List<String> strs) {
            StringBuilder encodedString = new StringBuilder();
            for (String str : strs) {
                int length = str.length();
                encodedString.append(length + "#");
                encodedString.append(str);
            }
            return encodedString.toString();
        }

        public List<String> decode(String str) {
            List<String> decodedStrings = new ArrayList();
            for (int i = 0; i < str.length(); i++) {
                String length = "";
                while (str.charAt(i) != '#') {
                    length += str.charAt(i);
                    i++;
                }
                int wordLength = Integer.parseInt(length);
                i++;

                String word = "";
                for (int j = i; j < wordLength + i; j++) {
                    word += str.charAt(j);
                }
                decodedStrings.add(word);
                i = i + wordLength - 1;
            }
            return decodedStrings;
    }
}
