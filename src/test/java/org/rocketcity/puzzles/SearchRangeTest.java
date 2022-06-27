package org.rocketcity.puzzles;

import org.junit.Test;

import static org.junit.Assert.assertEquals;


public class SearchRangeTest {
    @Test
    public void searchTest() {
        SearchRange sr = new SearchRange();

        int[] nums = {1, 2, 3, 3, 4, 9, 10};

        int result = sr.search(nums, 4);
        System.out.println("result = " + result);
        assertEquals(4, result);
    }
}
