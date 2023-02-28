public class Queue {
    private int size;
    private Node head;
    private Node tail;

    /**
     * Create a queue with size = 0
     */
    public Queue() {
        size = 0;
        head = tail = null;
    }

    /**
     * Create a queue with all element are 0s
     * 
     * @param size the size of the queue
     */
    public Queue(int size) {
        this.size = size;
        for (int i = 0; i < size; i++) {
            add(0);
        }
    }

    /**
     * Create the queue and put all elements in arr to queue
     * 
     * @param arr the array
     */
    public Queue(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            add(arr[i]);
        }
    }

    /**
     * Add a value at the last of the queue
     * 
     * @param value the value
     */
    public void add(int value) {
        if (isEmpty()) {
            head = tail = new Node(value);
        } else {
            Node newNode = new Node(value);
            newNode.setPrev(tail);
            tail.setNext(newNode);
            tail = newNode;
        }
        size++;
    }

    /**
     * Return the first value of the queue and remove it
     * 
     * @return the first value of the queue
     */
    public int poll() {
        int a = head.getValue();
        head = head.getNext();
        size--;
        return a;
    }

    /**
     * Return the first value of the queue but does not remove it
     * 
     * @return the first value of the queue
     */
    public int peek() {
        return head.getValue();
    }

    /**
     * Remove all values in the queue
     */
    public void clear() {
        head = tail = null;
        size = 0;
    }

    /**
     * Check if the queue is empty
     * 
     * @return {@code true} if the queue is empty
     *         <p>
     *         {@code false}if the queue is not empty
     */
    private boolean isEmpty() {
        return head == null;
    }

    /**
     * Return the size of the queue
     * 
     * @return the size of the queue
     */
    public int size() {
        return size;
    }

    /**
     * Get the queue
     */
    @Override
    public String toString() {
        Node currentNode = head;
        String res = "[";
        if (size > 0) {
            res += currentNode.getValue();
            currentNode = currentNode.getNext();
            while (currentNode != null) {
                res += ", " + currentNode.getValue();
                currentNode = currentNode.getNext();
            }
        }
        return res + "]";
    }

}
