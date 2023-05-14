package com.example;

public class Stack {
    private int size = 0;
    private int element;

    public class Underflow extends RuntimeException {
    }

    public boolean isEmpty() {
        return size == 0;
    }

    public void push(int element) {
        size++;
        this.element = element;
    }

    public int pop() {
        if (size == 0)
            throw new Underflow();
        --size;
        return element;
    }

    public int getSize() {
        return size;
    }
}
