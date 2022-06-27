package org.rocketcity.puzzles;

import java.util.Iterator;
import java.util.List;

public class AddingTwoNumbers {

    public int[] addTwoNumbers(List<Integer> list1, List<Integer> list2){
        Iterator<Integer> bigIt = list1.size()>=list2.size() ? list1.iterator() : list2.iterator();
        Iterator<Integer> smallIt = list1.size()<list2.size() ? list1.iterator() : list2.iterator();
        int maxSize = list1.size()>=list2.size() ? list1.size() + 1: list2.size() + 1;
        int[] sum = new int[maxSize];
        int index = 0;
        int carryOver = 0;
        while (bigIt.hasNext()) {
            if (smallIt.hasNext()) {
                sum[index] = bigIt.next() + smallIt.next() + carryOver;
            }else{
                sum[index] = bigIt.next() + carryOver;
            }
            carryOver = 0;
            if (sum[index] >= 10) {
                sum[index] = sum[index]-10;
                carryOver = 1;
            }
            index++;
        }
        sum[index] = carryOver;
        return sum;
    }
}

/**
 * You are given two non-empty linked lists representing two non-negative integers.
 * The digits are stored in reverse order, and each of their nodes contains a single digit.
 * Add the two numbers and return the sum as a linked list.
 *
 * You may assume the two numbers do not contain any leading zero, except the number 0 itself.
 *
 * Example 1:
 *
 * Input: l1 = [2,4,3], l2 = [5,6,4]
 * Output: [7,0,8]
 * Explanation: 342 + 465 = 807.
 * Example 2:
 *
 * Input: l1 = [0], l2 = [0]
 * Output: [0]
 * Example 3:
 *
 * Input: l1 = [9,9,9,9,9,9,9], l2 = [9,9,9,9]
 * Output: [8,9,9,9,0,0,0,1]
 *
 *
 * Constraints:
 *
 * The number of nodes in each linked list is in the range [1, 100].
 * 0 <= Node.val <= 9
 * It is guaranteed that the list represents a number that does not have leading zeros.
 */
