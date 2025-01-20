package com.project.attempt;

import java.util.HashSet;

public class LeetCodeAttempt {

    public static void main(String[] args) {

        System.out.println(uniqueLength3PalindromicSubsequences("aabca"));
        System.out.println(uniqueLength3PalindromicSubsequences("adc"));
        System.out.println(uniqueLength3PalindromicSubsequences("bbcbaba"));

    }

    // This method will return the number of 3-character palindromes that can be derived from string s.
    public static int uniqueLength3PalindromicSubsequences(String s) {

        // We will use a HashSet to store the palindromes as the
        // challenge instructions specified unique strings only.
        HashSet<String> uniquePalindromes = new HashSet<String>();

        // As we are looking for 3-character palindromes (without rearranging their relative order), we will
        // use three for-loops to increment through the string and try all possible 3-character combinations.
        for (int i = 0; i < s.length(); i++) {

            for (int j = i + 1; j < s.length(); j++) {

                for (int k = j + 1; k < s.length(); k++) {

                    // We only need to check the first and last letter for a palindrome. The
                    // middle letter is irrelevant. If it's a palindrome, add it to the HashSet.
                    if (s.charAt(i) == s.charAt(k)) {
                        uniquePalindromes.add(String.valueOf(s.charAt(i) + s.charAt(j) + s.charAt(k)));
                    }

                }

            }

        }

        // Return the size of our HashSet once all 3-character combinations have been tried.
        return uniquePalindromes.size();

    }

}
