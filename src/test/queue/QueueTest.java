package test.queue;

import main.queue.Queue;
import main.queue.exceptions.EmptyQueueException;
import main.queue.exceptions.FullQueueException;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;


public class QueueTest {

    @Test
    public void testAddAndRemove() {
        Queue queue = new Queue();

        assertTrue(queue.isEmpty());

        queue.add(1);
        queue.add(2);
        queue.add(3);

        assertFalse(queue.isEmpty());
        assertFalse(queue.isFull());

        assertEquals(1, queue.remove());
        assertEquals(2, queue.remove());
        assertEquals(3, queue.remove());

        assertTrue(queue.isEmpty());
    }

    @Test
    public void testEmptyQueueException() {
        Queue queue = new Queue();

        assertTrue(queue.isEmpty());

        assertThrows(EmptyQueueException.class, () -> {
            queue.remove();
        });
    }

    @Test
    public void testFullQueueException() {
        Queue queue = new Queue();

        for (int i = 0; i < 10; i++) {
            queue.add(i);
        }

        assertTrue(queue.isFull());

        assertThrows(FullQueueException.class, () -> {
            queue.add(10);
        });
    }
}
