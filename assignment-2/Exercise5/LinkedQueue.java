package km222pw_assign2.Exercise5;
import java.util.IllegalFormatException;
import java.util.Iterator;
import java.util.NoSuchElementException;



public class LinkedQueue<T> implements Queue<T> {
    public class Node {
        private T mElement;
        private Node mNextNode;
    }

    int size;
    Node head;
    Node tail;



    @Override
    public int size() {
        return size;
    }

    @Override
    public boolean isEmpty() {
        return head == null;
    }

    @Override
    public void enqueue(T element) {
        Node node = tail;
        tail = new Node();
        tail.mElement = element;
        tail.mNextNode = null;
        if (isEmpty()) {
            head = tail;

        } else {
            node.mNextNode = tail;
        }
        size++;

    }

    @Override
    public T dequeue() {
        if (size <= 0) {
            throw new NoSuchElementException("Queue is empty");
        } else {
            T element = head.mElement;
            head = head.mNextNode;
            size--;
            return element;
        }
    }

    @Override
    public T first() {
        if (size <= 0) {
            throw new NoSuchElementException("Queue is empty");
        }
        T element = head.mElement;
        return element;
    }

    @Override
    public T last() {
        if (size <= 0) {
            throw new NoSuchElementException("Queue is empty");
        }
        T element = tail.mElement;
        return element;
    }


    @Override
    public String toString() {
        String result = "";
        if (head == null) {
            return result;
        }
        result = result + head.mElement;
        Node temp = head.mNextNode;

        while (temp != null) {
            result = result + "\n" + temp.mElement;
            temp = temp.mNextNode;
        }

        return result;
    }


    @Override
    public Iterator<T> iterator() {
        return new Iterator<T>() {
            Node current = head;

            @Override
            public boolean hasNext() {
                return current != null;
            }

            @Override
            public T next() {
                if (current == null)
                    throw new NoSuchElementException();
                T element = current.mElement;
                current = current.mNextNode;
                return element;
            }


        };
    }
}
