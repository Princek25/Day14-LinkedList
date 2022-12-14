package com.bridgelabz;

public class MyNode<K> {
    private K data;
    private MyNode next;

    MyNode(K data) {
        this.data = data;
        this.next = null;
    }

    public K getData() {
        return data;
    }

    public void setData(K data) {
        this.data = data;
    }

    public MyNode getNext() {
        return next;
    }

    public void setNext(MyNode next) {
        this.next = next;
    }

    @Override
    public String toString() {
        return "Node{" +
                "data=" + data +
                ", next=" + next +
                '}';
    }
}
