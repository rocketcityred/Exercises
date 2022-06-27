package org.rocketcity.sorting;


import lombok.var;

import java.util.Arrays;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class MergeSorter implements ISorter{

    @Override
    public int[] sort(int[] inputArray) {
        if(inputArray.length == 1){
            return inputArray;
        }
        List<Integer> inputList = IntStream.of(inputArray).boxed().collect(Collectors.toList());
        int halfSize = inputList.size()/2;
        List<Integer> leftList = inputList.subList(0, halfSize);
        List<Integer> rightList = inputList.subList(halfSize, inputList.size());
        int [] leftArray = sort(leftList.stream().mapToInt(value->value).toArray());
        int [] rightArray = sort(rightList.stream().mapToInt(value->value).toArray());
        return merge(leftArray, rightArray);
    }

    private int[] merge(int[] leftArray, int[] rightArray) {
        if(leftArray.length < 1){
            return rightArray;
        } else if (rightArray.length < 1) {
            return leftArray;
        }
        List<Integer> leftList = Arrays.stream(leftArray).boxed().collect(Collectors.toList());
        List<Integer> rightList = Arrays.stream(rightArray).boxed().collect(Collectors.toList());
        var mergedList = new LinkedList<Integer>();
        Iterator<Integer> leftIterator = leftList.iterator();
        Iterator<Integer> rightIterator = rightList.iterator();
        Integer leftValue = leftIterator.next();
        Integer rightValue = rightIterator.next();
        while (!leftList.isEmpty() && !rightList.isEmpty()) {
            if (leftValue < rightValue) {
                mergedList.add(leftValue);
                leftIterator.remove();
                if(leftIterator.hasNext()) {
                    leftValue = leftIterator.next();
                }
            }else{
                mergedList.add(rightValue);
                rightIterator.remove();
                if(rightIterator.hasNext()) {
                    rightValue = rightIterator.next();
                }
            }
        }
        leftIterator = leftList.iterator();
        while (!leftList.isEmpty()) {
            mergedList.add(leftIterator.next());
            leftIterator.remove();
        }

        rightIterator = rightList.iterator();
        while (!rightList.isEmpty()) {
            mergedList.add(rightIterator.next());
            rightIterator.remove();
        }
        return mergedList.stream().mapToInt(value->value).toArray();
    }
}
