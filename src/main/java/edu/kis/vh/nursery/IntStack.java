package edu.kis.vh.nursery;

public interface IntStack {
    void push(int in);

    boolean isEmpty();

    boolean isFull();

    int pop();

    int top();
}
