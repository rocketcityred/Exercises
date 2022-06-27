package org.rocketcity.structures;

import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

public class RCList implements List<Integer> {

    private RCListNode head;

    private RCListNode traverse() {
        RCListNode nextNode = head.getNextNode();
        if(nextNode == null){
            return head;
        }
        RCListNode lastValidNode = null;
        while (nextNode != null) {
            lastValidNode = nextNode;
            nextNode = next(nextNode);
        }
        return lastValidNode;
    }

    @Override
    public boolean add(Integer integer) {
        if(head == null){
            head = new RCListNode(integer);
            return true;
        }
        RCListNode node = traverse();
        node.setNextNode(new RCListNode(integer));
        return true;
    }

    private RCListNode next(RCListNode currentNode){
        RCListNode nextNode = currentNode.getNextNode();
        return nextNode;
    }

    @Override
    public int size() {
        return 0;
    }

    @Override
    public boolean isEmpty() {
        return false;
    }

    @Override
    public boolean contains(Object o) {
        return false;
    }

    @Override
    public Iterator<Integer> iterator() {
        return null;
    }

    @Override
    public Object[] toArray() {
        return new Object[0];
    }

    @Override
    public <T> T[] toArray(T[] a) {
        return null;
    }



    @Override
    public boolean remove(Object o) {
        return false;
    }

    @Override
    public boolean containsAll(Collection<?> c) {
        return false;
    }

    @Override
    public boolean addAll(Collection<? extends Integer> c) {
        return false;
    }

    @Override
    public boolean addAll(int index, Collection<? extends Integer> c) {
        return false;
    }

    @Override
    public boolean removeAll(Collection<?> c) {
        return false;
    }

    @Override
    public boolean retainAll(Collection<?> c) {
        return false;
    }

    @Override
    public void clear() {

    }

    @Override
    public Integer get(int index) {
        return null;
    }

    @Override
    public Integer set(int index, Integer element) {
        return null;
    }

    @Override
    public void add(int index, Integer element) {

    }

    @Override
    public Integer remove(int index) {
        return null;
    }

    @Override
    public int indexOf(Object o) {
        return 0;
    }

    @Override
    public int lastIndexOf(Object o) {
        return 0;
    }

    @Override
    public ListIterator<Integer> listIterator() {
        return null;
    }

    @Override
    public ListIterator<Integer> listIterator(int index) {
        return null;
    }

    @Override
    public List<Integer> subList(int fromIndex, int toIndex) {
        return null;
    }

    @Override
    public String toString() {
        StringBuilder builder = new StringBuilder();
        if(head == null){
            return("Empty list");
        }
        builder.append(head.getValue());
        RCListNode nextNode = next(head);
        while (nextNode != null) {
            builder.append(nextNode.getValue());
            nextNode = next(nextNode);
        }
        return builder.toString();
    }
}