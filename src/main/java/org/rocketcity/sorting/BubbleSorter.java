package org.rocketcity.sorting;

public class BubbleSorter implements ISorter{
    @Override
    public int[] sort(int[] array) {
        int j = array.length;
        while(j >=0) {
            int i = 0;
            while (i<j-1) {
                if (array[i] < array[i + 1]) {
                    int tmp = array[i];
                    array[i] = array[i + 1];
                    array[i + 1] = tmp;
                }
                i++;
            }
            j--;
        }
        return array;
    }
}
