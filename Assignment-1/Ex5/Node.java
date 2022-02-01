package queue_ex5;

/**
 * {@code Node} is a public class  to reach and nomination data.
 */
public class Node {

    private int data;
    private Node nextNode;

    /**
     * Instantiates a new Node.
     *
     * @param data the data (an integer element)
     */
    public Node(int data){
        this.data = data;
    }

    /**
     * Gets data.
     *
     * @return the data
     */
    public int getData() {
        return data;
    }

    /**
     * Sets data.
     *
     * @param data location of the data
     */
    public void setData(int data) {
        this.data = data;
    }

    /**
     * Gets next node.
     *
     * @return the next node
     */
    public Node getNextNode() {
        return nextNode;
    }

    /**
     * Sets next node.
     * @param nextNode location of the next node
     */

    public void setNextNode(Node nextNode) {
        this.nextNode = nextNode;
    }
}