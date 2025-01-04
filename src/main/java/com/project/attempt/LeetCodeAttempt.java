package com.project.attempt;

import java.util.HashSet;

public class LeetCodeAttempt {

    public static void main(String[] args) {

        System.out.println(uniqueLength3PalindromicSubsequences("aabca"));
        System.out.println(uniqueLength3PalindromicSubsequences("adc"));
        System.out.println(uniqueLength3PalindromicSubsequences("bbcbaba"));

    }

    public static int uniqueLength3PalindromicSubsequences(String s) {

        HashSet<String> uniquePalindromes = new HashSet<String>();

        for (int i = 0; i < s.length(); i++) {

            for (int j = i + 1; j < s.length(); j++) {

                for (int k = j + 1; k < s.length(); k++) {

                    if (s.charAt(i) == s.charAt(k)) {
                        uniquePalindromes.add(String.valueOf(s.charAt(i) + s.charAt(j) + s.charAt(k)));
                    }

                }

            }

        }

        return uniquePalindromes.size();

    }

}
