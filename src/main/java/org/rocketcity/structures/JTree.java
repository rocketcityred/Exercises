package org.rocketcity.structures;

import lombok.Getter;
import lombok.Setter;

public class JTree {

    private Node root;

    public int put(int value) {
        if (root == null) {
            root = new Node(value);
            System.out.println("root = " + value);
            return root.getValue();
        }else{
            Node focusNode = root;
            while(true) {
                if (value < focusNode.getValue()) {
                    if (focusNode.getLeftChild() == null) {
                        Node newNode = new Node(value);
                        newNode.setParent(focusNode);
                        focusNode.setLeftChild(newNode);
                        System.out.println("Added left: " + focusNode.getLeftChild().getValue());
                        return focusNode.leftChild.getValue();
                    }else{
                        focusNode = focusNode.getLeftChild();
                    }
                } else {
                    if (focusNode.getRightChild() == null) {
                        Node newNode = new Node(value);
                        newNode.setParent(focusNode);
                        focusNode.setRightChild(newNode);
                        System.out.println("Added right: " + focusNode.getRightChild().getValue());
                        return focusNode.rightChild.getValue();
                    }else{
                        focusNode = focusNode.getRightChild();
                    }
                }
            }
        }
    }

    public void traverse(){
        if (root != null) {
            inOrderTraverse(root);
        }
    }

    private void inOrderTraverse(Node node) {
        Node focusNode = node;
        if(focusNode.getLeftChild() != null){
            inOrderTraverse(focusNode.getLeftChild());
        }
        System.out.println(focusNode);
        if (focusNode.getRightChild() != null) {
            inOrderTraverse(focusNode.getRightChild());
        }
    }


    @Getter
    @Setter
    private class Node{
        int value;
        Node leftChild;
        Node rightChild;

        Node parent;

        public Node(int value) {this.value = value;}

        @Override
        public String toString() {
            return Integer.toString(value);
        }
    }

}
