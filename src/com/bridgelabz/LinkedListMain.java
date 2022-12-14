package com.bridgelabz;

public class LinkedListMain {
    public static void main(String[] args) {
        MyNode<Integer> node1 = new MyNode<Integer>(56);
        MyNode<Integer> node2 = new MyNode<Integer>(70);
        MyNode<Integer> node3 = new MyNode<Integer>(30);

        MyLinkedList list = new MyLinkedList();
        list.append(node1);
        list.append(node2);
        list.append(node3);
        list.printMyNode();
        System.out.println("Delete 56 from the list");
        list.pop();
        list.printMyNode();
    }
}
