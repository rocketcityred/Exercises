package org.rocketcity.puzzles;

import org.junit.Test;

import static org.testng.AssertJUnit.assertTrue;

public class PalindromeNumberTest {
    @Test
    public void palindromeTest(){
        PalindromeNumber pn = new PalindromeNumber();
        assertTrue(pn.isPalindrome(12345));
    }
}
