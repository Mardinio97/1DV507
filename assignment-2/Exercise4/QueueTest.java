package km222pw_assign2.Exercise4;

import km222pw_assign2.Exercise5.LinkedQueue;
import org.junit.jupiter.api.Test;

import java.util.ArrayDeque;
import java.util.Iterator;


import static org.junit.jupiter.api.Assertions.*;

public class QueueTest {
    private LinkedQueue<String> queue_String = new LinkedQueue();
    private LinkedQueue<Integer> queue_Int = new LinkedQueue();
    private LinkedQueue<Object> queue_Object = new LinkedQueue();


    @Test
    void isEmpty() {


        queue_Int.enqueue(100);

        assertFalse(queue_Int.isEmpty());
        assertTrue(queue_String.isEmpty());
        assertTrue(queue_Object.isEmpty());

    }

    @Test
    void enqueue() {
        queue_Int.enqueue(100);
        queue_String.enqueue("Test");
        queue_Object.enqueue(4);
        queue_Object.enqueue("Test");

        assertEquals(100, queue_Int.first());
        assertEquals("Test", queue_String.first());
        assertEquals(4, queue_Object.first());
        assertEquals("Test", queue_Object.last());
    }

    @Test
    void dequeue() {
        queue_Int.enqueue(100);
        queue_Int.enqueue(200);
        queue_Int.dequeue();

        assertEquals(200, queue_Int.first());

        queue_String.enqueue("Test");
        queue_String.enqueue("Test2");
        assertEquals("Test", queue_String.dequeue());

        assertEquals("Test2", queue_String.first());

        queue_Object.enqueue(4);
        queue_Object.enqueue("Test");
        queue_Object.dequeue();
        queue_Object.dequeue();
        assertTrue(queue_Object.isEmpty());

    }

    @Test
    void first() {
        queue_Int.enqueue(100);
        queue_Int.enqueue(200);
        assertEquals(100, queue_Int.first());

        queue_String.enqueue("Test");
        queue_String.enqueue("Test2");
        assertEquals("Test", queue_String.first());

        queue_Object.enqueue(4);
        queue_Object.enqueue("Test");

        assertEquals(4, queue_Object.first());


    }

    @Test
    void last() {
        queue_Int.enqueue(100);
        queue_Int.enqueue(200);
        assertEquals(200, queue_Int.last());

        queue_String.enqueue("Test");
        queue_String.enqueue("Test2");
        assertEquals("Test2", queue_String.last());


        queue_Object.enqueue(4);
        queue_Object.enqueue("Test");

        assertEquals("Test", queue_Object.last());
    }

    @Test
    void testToString() {
        String test = "100" + "\n" + "Test";
        queue_Int.enqueue(100);
        assertEquals("100", queue_Int.toString());

        queue_Object.enqueue(100);
        queue_Object.enqueue("Test");

        assertEquals(test, queue_Object.toString());
        System.out.println(queue_Object.toString());



    }

    @Test
    void size() {
        queue_Int.enqueue(100);
        queue_Int.enqueue(200);
        assertTrue(queue_Int.size() == 2);
        queue_String.enqueue("Test");
        queue_String.enqueue("Test2");
        assertTrue(queue_String.size() == 2);

        queue_Object.enqueue(4);
        queue_Object.enqueue("Test");
        queue_Object.enqueue(4);
        assertTrue(queue_Object.size() == 3);

    }
}