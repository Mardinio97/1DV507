package queue_ex5;
/**
 * A queue typically, but not necessarily, order elements in a first-in-first-out (FIFO).
 * @author Khalil Mardini
 * @version 1.0
 * @since 2020-07-11
 */
public interface IntQueue extends Iterable<Integer> {
    /**
     *current queue size.
     *
     * @return the int (size).
     */
    public int size();                     // current queue size

    /**
     * Is empty boolean.
     *
     * @return the boolean
     */
    public boolean isEmpty();              // true if queue is empty

    /**
     *  add element at end of queue.
     *
     * @param element the element
     */
    public void enqueue(int element);   // add element at end of queue

    /**
     * return and remove first element.
     *
     * @return the int
     */
    public int dequeue();               // return and remove first element.

    /**
     * return (without removing) first element
     *
     * @return the int
     */
    public int first();                 // return (without removing) first element

    /**
     * return (without removing) last element
     *
     * @return the int
     */
    public int last();        // return (without removing) last element

    /**
     * return a string representation of the queue content
     * @return string
     */
    public String toString();              // return a string representation of the queue content

}