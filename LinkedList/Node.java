public class Node {

    private int value; // the value of a node
    private Node next; // the next node

    /**
     * Create a node
     * <p>
     * A node contains value and the next node
     * 
     * @param value the value
     */
    public Node(int value) {
        this.value = value;
        this.next = null;
    }

    /**
     * get value of a node
     * 
     * @return value of a node
     */
    public int getValue() {
        return this.value;
    }

    /**
     * Set the value of a node
     * 
     * @param value the value
     */
    public void setValue(int value) {
        this.value = value;
    }

    /**
     * get next node of a node
     * 
     * @return next node of a node
     */
    public Node getNext() {
        return this.next;
    }

    /**
     * Set the next node of a node
     * 
     * @param next the next node
     */
    public void setNext(Node next) {
        this.next = next;
    }

}
