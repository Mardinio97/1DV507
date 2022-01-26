package queue_ex5;
import java.util.Iterator;


/**
 * This class provide a main method to test and show how all methods from LinkedQueue.java works.
 * @author  Khalil Mardini
 * @version 1.0
 * @since   2020-07-11
 */
public class QueueMain {
    /**
     *
     * @param args The command line arguments.
     * @throws Exception the exception if a problem occurs.
     */
    public static void main(String args[]) throws Exception {
        LinkedQueue linkedQueue = new LinkedQueue(null,null);
        //isEmpty function
        System.out.println("queue is empty? " + linkedQueue.isEmpty());
        //enqueue function
        linkedQueue.enqueue(5);
        linkedQueue.enqueue(6);
        linkedQueue.enqueue(7);
        System.out.println(linkedQueue.toString());
        System.out.println("queue is empty? " + linkedQueue.isEmpty());
        //dequeue function
        System.out.println( linkedQueue.dequeue());
        //size function
        System.out.println("It has to be (2)");
        System.out.println("Queue size: " + linkedQueue.size());
        //first function
        System.out.println("It has to be (6)");
        System.out.println("First element is: " + linkedQueue.first());
        linkedQueue.enqueue(8);
        linkedQueue.enqueue(9);
        System.out.println(linkedQueue.toString());
        //last function
        System.out.println("It has to be (9)");
        System.out.println("First element is: " + linkedQueue.last());
        //iterator function
        Iterator integerIterator = linkedQueue.iterator();
        while (integerIterator.hasNext()){
            System.out.println(integerIterator.next());
        }
    }
}
