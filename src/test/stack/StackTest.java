package test.stack;

import static org.junit.jupiter.api.Assertions.*;

import main.stack.Stack;
import main.stack.exceptions.EmptyStackException;
import main.stack.exceptions.FullStackException;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class StackTest {

    @Test
    public void testPushAndPop() {
        Stack stack = new Stack();

        assertTrue(stack.isEmpty());

        stack.push(1);
        stack.push(2);
        stack.push(3);

        assertFalse(stack.isEmpty());
        assertFalse(stack.isFull());

        assertEquals(3, stack.pop());
        assertEquals(2, stack.pop());
        assertEquals(1, stack.pop());

        assertTrue(stack.isEmpty());
    }

    @Test
    public void testEmptyStackException() {
        Stack stack = new Stack();

        assertTrue(stack.isEmpty());

        assertThrows(EmptyStackException.class, () -> {
            stack.pop();
        });
    }

    @Test
    public void testFullStackException() {
        Stack stack = new Stack();

        assertFalse(stack.isFull());

        for (int i = 0; i < 10; i++) {
            stack.push(i);
        }

        assertTrue(stack.isFull());

        assertThrows(FullStackException.class, () -> {
            stack.push(10);
        });
    }
}
