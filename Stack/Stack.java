public class Stack {
    private int size;
    private Node head;
    private Node tail;

    /**
     * Create a stack with size = 0
     */
    public Stack() {
        size = 0;
        head = tail = null;
    }

    /**
     * Create a stack with all element are 0s
     * 
     * @param size the size of the stack
     */
    public Stack(int size) {
        this.size = size;
        for (int i = 0; i < size; i++) {
            push(0);
        }
    }

    /**
     * Create the stack and put all elements in arr to stack
     * 
     * @param arr the array
     */
    public Stack(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            push(arr[i]);
        }
    }

    /**
     * push a value at the last of the stack
     * 
     * @param value the value
     */
    public void push(int value) {
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
     * Return the last value of the stack and remove it
     * 
     * @return the last value of the stack
     */
    public int poll() {
        int a = tail.getValue();
        tail = tail.getPrev();
        tail.setNext(null);
        size--;
        return a;
    }

    /**
     * Return the last value of the stack but does not remove it
     * 
     * @return the last value of the stack
     */
    public int peek() {
        return tail.getValue();
    }

    /**
     * Remove all values in the stack
     */
    public void clear() {
        head = tail = null;
        size = 0;
    }

    /**
     * Check if the stack is empty
     * 
     * @return {@code true} if the stack is empty
     *         <p>
     *         {@code false}if the stack is not empty
     */
    private boolean isEmpty() {
        return head == null;
    }

    /**
     * Return the size of the stack
     * 
     * @return the size of the stack
     */
    public int size() {
        return size;
    }

    /**
     * Get the stack
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
