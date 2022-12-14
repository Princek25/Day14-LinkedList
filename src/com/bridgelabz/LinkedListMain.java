package com.bridgelabz;

public class LinkedListMain {
    public static void main(String[] args) {
        MyNode<Integer> node1 = new MyNode<Integer>(70);
        MyNode<Integer> node2 = new MyNode<Integer>(30);
        MyNode<Integer> node3 = new MyNode<Integer>(56);

        MyLinkedList list = new MyLinkedList();
        list.add(node1);
        list.add(node2);
        list.add(node3);
        list.printMyNode();
    }
}
