package org.rocketcity.sorting;

import org.rocketcity.sorting.BubbleSorter;
import org.rocketcity.sorting.ISorter;
import org.rocketcity.sorting.MergeSorter;
import org.testng.annotations.Test;

import java.util.Arrays;

public class SortingTests {

    @Test
    void mergeSortTest(){
        ISorter ms = new MergeSorter();
        int [] inputArray = {1,3,5,2,10,7,4,2};

        int[] sortedArray = ms.sort(inputArray);
        System.out.println(Arrays.toString(sortedArray));
    }

    @Test
    void bubbleSortTest(){
        ISorter bs = new BubbleSorter();
        int [] inputArray = {1,3,5,2,10,7,4,2};

        int[] sortedArray = bs.sort(inputArray);
        System.out.println(Arrays.toString(sortedArray));
    }
}
