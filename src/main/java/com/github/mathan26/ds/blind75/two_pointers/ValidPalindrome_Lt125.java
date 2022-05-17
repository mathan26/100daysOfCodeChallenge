package com.github.mathan26.ds.blind75.two_pointers;

/*
A phrase is a palindrome if, after converting all uppercase letters into lowercase letters and removing all non-alphanumeric characters, it reads the same forward and backward. Alphanumeric characters include letters and numbers.

        Given a string s, return true if it is a palindrome, or false otherwise.



        Example 1:

        Input: s = "A man, a plan, a canal: Panama"
        Output: true
        Explanation: "amanaplanacanalpanama" is a palindrome.
        */
public class ValidPalindrome_Lt125 {
    public boolean isPalindrome(String s) {
        //This for storing after the extra character present for the input given!
        StringBuilder content = new StringBuilder();

        for (int i = 0; i < s.length(); i++) {
            // Check for char is alphanumeric or not
            if (Character.isLetterOrDigit(s.charAt(i)))
                content.append(s.charAt(i));
        }
        // remove the spaces
        content = new StringBuilder(content.toString().replace(" ", "").toLowerCase());
        String value = content.toString();

        // Can be used Two pointer comparison also.
        //check palindrome or not!
        return value.equals(content.reverse().toString());
    }
}
