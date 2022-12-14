package com.bridgelabz;

public class LinkedListMain {
    public static void main(String[] args) {
        MyNode<Integer> node1 = new MyNode<>(56);
        MyNode<Integer> node2 = new MyNode<>(30);
        MyNode<Integer> node3 = new MyNode<>(70);
        node1.setNext(node2);
        node2.setNext(node3);
        System.out.println(node1);
    }
}
