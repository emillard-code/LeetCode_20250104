package com.project;

import com.project.attempt.LeetCodeAttempt;

import org.junit.jupiter.api.*;
import static org.junit.jupiter.api.Assertions.*;

public class LeetCodeAttemptTest {

    @Test
    public void countVowelStringsInRangeTest() {

        assertEquals(3, LeetCodeAttempt.uniqueLength3PalindromicSubsequences("aabca"));
        assertEquals(0, LeetCodeAttempt.uniqueLength3PalindromicSubsequences("adc"));
        assertEquals(4, LeetCodeAttempt.uniqueLength3PalindromicSubsequences("bbcbaba"));

    }

}
