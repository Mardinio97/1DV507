package queue_ex5;

import java.util.Iterator;

/**
 * {@code LinkedQueue} A class which implements IntQueue interface.
 * {@code LinkedQueue} provide differences methods such as <b>enqueue</b> and <b>dequeue</b> for adding  and removing elements which follows the first in first out principle.
 * As well as size and isEmpty methods to check current queue size and return it.
 * Inclusive of first and last methods to return the head and the tail of the LinkedQueue.
 * Plus toString method to convert the LinkedQueue into a string to represents all elements.
 * @author Khalil Mardini
 * @version 1.0
 * @since 2020-07-11
 */
public class LinkedQueue implements IntQueue {
    /**
     * {@link int} Length of LinkedQueue (number of elements).
     */
    public int length;
    /**
     * {@link Node } The head of the Queue (First element).
     */
    public Node head;
    /**
     * {@link Node } The tail of queue (Last element).
     */
    public Node tail;

    /**
     * Instantiates a new Linked queue.
     *
     * @param head Head of LinkedQueue.
     * @param tail tail of LinkedQueue.
     */
    public LinkedQueue(Node head, Node tail) {
        this.length = 0;
        this.head = null;
        this.tail = null;
    }


    /**
     * @return An integer (current queue size).
     */
    @Override
    public int size() {
        return length;
    }

    /**
     * @return boolean (true/false) if it is empty or not.
     */

    @Override
    public boolean isEmpty() {
        return length == 0;
    }

    /**
     * @param element Integer to be added at end of queue.
     */
    @Override
    public void enqueue(int element) {
        Node node = new Node(element);
        if (isEmpty()) {
            head = node;
        } else {
            tail.setNextNode(node);
        }
        tail = node;
        length++;
    }

    /**
     * @return and remove first element (the head).
     */
    @Override
    public int dequeue() {
        if (isEmpty()) {
            try {
                throw new Exception("Empty queue");
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
        int result = head.getData();
        head = head.getNextNode();
        length--;
        if (isEmpty()) {
            tail = null;
        }

        return result;
    }

    /**
     * @return first element (the head).
     */
    @Override
    public int first() {
        int result = head.getData();
        return result;
    }

    /**
     * @return last element (the head).
     */
    @Override
    public int last() {
        return tail.getData();
    }

    /**
     * @return a string to represents all elements.
     */
    @Override
    public String toString() {
        String result = "[";
        if (head == null) {
            return result + "]";
        }
        result = result + head.getData();
        Node temp = head.getNextNode();
        ;
        while (temp != null) {
            result = result + ", " + temp.getData();
            temp = temp.getNextNode();
        }

        return result + "]";
    }

    /**
     * A method returns an iterator interface. Which is a collection framework to retrieve elements one by one in FIFO order.
     *
     * @return {@link QueueIterator}
     */
    @Override
    public Iterator<Integer> iterator() {
        return new QueueIterator();
    }


    /**
     * {@code QueueIterator} A class which implements Iterator interface. Provides differences methods that helps to retrieve elements one by one.
     */
    public class QueueIterator implements Iterator<Integer> {
        /**
         * The Node to represent the head of the queue.
         */
        Node node = head;

        /**
         * @return boolean if head is null or not.
         */

        @Override
        public boolean hasNext() {
            return node != null;
        }

        /**
         * @return integer (Elements).
         */
        @Override
        public Integer next() {
            int element = node.getData();
            node = node.getNextNode();
            return element;
        }


    }
}
