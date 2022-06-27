package org.rocketcity.puzzles;

import org.junit.Test;

import java.util.Arrays;
import java.util.List;

public class AddingTwoNumbersTest {
    private AddingTwoNumbers ex = new AddingTwoNumbers();

    @Test
    public void AddingTwoNumbersTest() {
        List<Integer> list1 = Arrays.asList(9,9,9,9,9,9,9);
        List<Integer> list2 = Arrays.asList(9,9,9,9);
        int[] sum = ex.addTwoNumbers(list1, list2);
        for (int value : sum) {
            System.out.println(value);
        }
    }
}

