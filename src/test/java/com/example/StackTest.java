package com.example;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import org.junit.Test;

/**
 * Unit test for simple Stack.
 */
public class StackTest {
    private Stack stack = new Stack();

    @Test
    public void canCreateStack() throws Exception {
        assertTrue(stack.isEmpty());
    }

    @Test
    public void afterOnePush_isNotEmpty() throws Exception {
        stack.push(0);
        stack.pop();
        assertTrue(stack.isEmpty());
    }
}
