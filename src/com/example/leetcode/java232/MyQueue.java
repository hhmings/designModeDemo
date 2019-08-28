package com.example.leetcode.java232;

import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

/**
 * @author houhaimin
 * @version 1.0
 * @date 2019/8/27 23:00
 */
public class MyQueue {

    private LinkedList<Integer> list;

    /** Initialize your data structure here. */
    public MyQueue() {
        list = new LinkedList<Integer>();
    }

    /** Push element x to the back of queue. */
    public void push(int x) {
        list.addLast(x);
    }

    /** Removes the element from in front of queue and returns that element. */
    public int pop() {
        return list.removeFirst();
    }

    /** Get the front element. */
    public int peek() {
        return list.getFirst();
    }

    /** Returns whether the queue is empty. */
    public boolean empty() {
        return list.isEmpty();
    }
}
