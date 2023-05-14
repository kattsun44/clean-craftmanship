package com.example;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import org.junit.Test;

/**
 * Unit test for simple Stack.
 */
public class StackTest {
    @Test
    public void canCreateStack() throws Exception {
        Stack stack = new Stack();
        assertTrue(stack.isEmpty());
    }

    @Test
    public void canPush() throws Exception {
        Stack stack = new Stack();
        stack.push(0);
        assertFalse(stack.isEmpty());
    }
}
