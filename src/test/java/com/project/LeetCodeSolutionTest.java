package com.project;

import com.project.solution.LeetCodeSolution;

import org.junit.jupiter.api.*;
import static org.junit.jupiter.api.Assertions.*;

public class LeetCodeSolutionTest {

    @Test
    public void countVowelStringsInRangeTest() {

        assertEquals(3, LeetCodeSolution.countPalindromicSubsequence("aabca"));
        assertEquals(0, LeetCodeSolution.countPalindromicSubsequence("adc"));
        assertEquals(4, LeetCodeSolution.countPalindromicSubsequence("bbcbaba"));

    }

}
