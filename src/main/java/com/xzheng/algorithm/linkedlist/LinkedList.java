package com.xzheng.algorithm.linkedlist;

/**
 * Created by zhengxiaoqiang on 17/3/11.
 */
public class LinkedList {
    private Node head = null;
    private Node tail = head;

    public LinkedList() {

    }

    public void insertNode(int data) {
        if (tail == null) {
            tail = new Node();
            head = tail;
        }
        tail.data = data;
        tail.next = new Node();
        tail = tail.next;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder("[");
        Node p = head;
        while (p != null) {
            sb.append(p.data);
            sb.append(" ");
            p = p.next;
        }
        return sb.toString();
    }


}
