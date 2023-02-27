/**
 * @author Khang Ta
 */
public class DoublyLinkedList {
    private int size = 0; //size of the list
    private int[] a;
    Node head; //the first node
    Node tail; //the last node

    /**
     * Create a list with size = 0
     */
    public DoublyLinkedList() {
        head = tail = null;
        size = 0;
    }

    /**
     * Create a list with size and all elements are 0s
     * 
     * @param size the size of the list
     */
    public DoublyLinkedList(int size) {
        for (int i = 0; i < size; i++) {
            add(0);
        }
        this.size = size;
    }

    /**
     * Create a list and put all elements from arr to list
     * 
     * @param arr the array
     */
    public DoublyLinkedList(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            add(arr[i]);
        }
        this.size = arr.length;
    }

    /**
     * add a value at the last index of the list
     * <p>
     * This code is equivalent to {@code addLast(value)}
     * 
     * @param value the value
     */
    public void add(int value) {
        addLast(value);
    }

    /**
     * Add a value at the first index of the list
     * 
     * @param value the value
     */
    public void addFirst(int value) {
        Node newNode = new Node(value);
        if (isEmpty()) {
            head = tail = newNode;
        } else {
            newNode.setNext(head);
            head.setPrev(newNode);
            head = newNode;
        }
        size++;
    }

    /**
     * add a value at the last index of the list
     * <p>
     * This code is equivalent to {@code add(value)}
     * 
     * @param value the value
     */
    public void addLast(int value) {
        Node newNode = new Node(value);
        if (isEmpty()) {
            head = tail = newNode;
        } else {
            newNode.setPrev(tail);
            tail.setNext(newNode);
            tail = newNode;
        }
        size++;
    }

    /**
     * Insert a value at index
     * <p>
     * Throw exception if the index is out of range [0, size]
     * 
     * @param index the index
     * @param value the value
     */
    public void insert(int index, int value) {
        if (index < 0 || index > size)
            throw new NullPointerException("The Index is out of the list.");
        if (index == 0) {
            addFirst(value);
        } else if (index == size) {
            addLast(value);
        } else {
            Node currentNode = head;
            Node newNode = new Node(value);
            for (int i = 0; i < index - 1; i++) {
                currentNode = currentNode.getNext();
            }
            currentNode.getNext().setPrev(newNode);
            newNode.setNext(currentNode.getNext());
            currentNode.setNext(newNode);
            newNode.setPrev(currentNode);
            size++;
        }
    }

    /**
     * Replace a value in the list at index
     * <p>
     * Throw exception if the index is out of range [0, size - 1]
     * 
     * @param index the value
     * @param value the index
     */
    public void replace(int index, int value) {
        if (index < 0 || index > size)
            throw new NullPointerException("The Index is out of the list.");
        Node currentNode = head;

        for (int i = 0; i < index; i++) {
            currentNode = currentNode.getNext();
        }
        currentNode.setValue(value);
        size++;
    }

    /**
     * Remove all elements of the list
     */
    public void clear() {
        head = tail = null;
        size = 0;
    }

    /**
     * Remove the first element of the list
     * <p>
     * This code is equivalent to {@code removeAt(0)}
     */
    public void removeFirst() {
        if (size > 1) {
            head = head.getNext();
            head.setPrev(null);
        } else
            clear();
        size--;
    }

    /**
     * Remove the last element of the list
     * <p>
     * This code is equivalent to {@code removeAt(size-1)}
     */
    public void removeLast() {
        if (size > 1) {
            tail = tail.getPrev();
            tail.setNext(null);
        } else
            clear();
        size--;
    }

    /**
     * Remove an element at index
     * <p>
     * Throw exception if the index is out of range [0, size - 1]
     * 
     * @param index the index
     */
    public void removeAt(int index) {
        if (index < 0 || index > size - 1)
            throw new NullPointerException();
        if (index == 0) {
            removeFirst();
        } else if (index == size - 1) {
            removeLast();
        } else {
            Node currentNode = head;
            for (int i = 0; i < index; i++) {
                currentNode = currentNode.getNext();
            }
            currentNode.getPrev().setNext(currentNode.getNext());
            currentNode.getNext().setPrev(currentNode.getPrev());
            size--;
        }
    }

    /**
     * Remove a value of the list
     * <p>
     * Do nothing, if not found the value
     * 
     * @param value the value
     */
    public void remove(int value) {
        int index = indexOf(value);
        if (index != -1)
            removeAt(index);
    }

    /**
     * return the size of the list
     * 
     * @return the size of the list
     */
    public int size() {
        return size;
    }

    /**
     * Get the index of the list which is contains value from first index to last
     * index
     * 
     * @param value the value
     * @return the first index of the list which is contains value
     *         <p>
     *         -1 if not found
     */
    public int indexOf(int value) {
        int index = 0;
        Node currentNode = head;
        while (currentNode.getNext() != null) {

            if (currentNode.getValue() == value) {
                return index;
            }
            currentNode = currentNode.getNext();
            index++;
        }
        return -1;
    }

    /**
     * Find the index of the list which is contains value from first index to last
     * index
     * 
     * @param value the value
     * @return the last index of the list which is contains value
     *         <p>
     *         -1 if not found
     */
    public int lastIndexOf(int value) {
        int index = size - 1;
        Node currentNode = tail;
        while (currentNode.getPrev() != null) {

            if (currentNode.getValue() == value) {
                return index;
            }
            currentNode = currentNode.getPrev();
            index--;
        }
        return -1;
    }

    /**
     * Check if the value is in the list
     * 
     * @param value
     * @return {@code true} if the value is in the list
     *         <p>
     *         {@code false} if the value is not in the list
     */
    public boolean contains(int value) {
        return indexOf(value) != -1;
    }

    /**
     * Check if the list is empty
     * 
     * @return {@code true} if the list is empty
     *         <p>
     *         {@code false} if the list is not empty
     */
    public boolean isEmpty() {
        return head == null;
    }

    /**
     * Get the value of the list at index
     * <p>
     * Throw exception if the index is out of range [0, size - 1]
     * 
     * @param index the index
     * @return the value of the list at index
     */
    public int get(int index) {
        if (index < 0 || index > size - 1)
            throw new NullPointerException();
        if (index <= (size - 1) / 2) {
            return getLeft(index);
        }
        return getRight(index);
    }

    private int getRight(int index) {
        Node currentNode = tail;
        for (int i = size - 1; i > index; i--) {
            currentNode = currentNode.getPrev();
        }
        return currentNode.getValue();
    }

    private int getLeft(int index) {
        Node currentNode = head;
        for (int i = 0; i < index; i++) {
            currentNode = currentNode.getNext();
        }
        return currentNode.getValue();
    }

    /**
     * Sort the array ascending
     * <p>
     * This code is equivalent to {@code sort(true)}
     */
    public void sort() {
        a = new int[size];
        int i = 0;
        if (head != null) {
            Node currentNode = head;
            while (i < size) {
                a[i] = currentNode.getValue();
                currentNode = currentNode.getNext();
                i++;
            }
        }
        sort(true);
    }

    /**
     * Sort the array
     * 
     * @param isSortAscending
     *                        <p>
     *                        {@code true} if sort the array ascending.
     *                        <p>
     *                        (This code is equivalent to {@code sort()})
     *                        <p>
     *                        {@code false} if sort the array descending
     */
    public void sort(boolean isSortAscending) {
        a = new int[size];
        int i = 0;
        if (head != null) {
            Node currentNode = head;
            while (i < size) {
                a[i] = currentNode.getValue();
                currentNode = currentNode.getNext();
                i++;
            }
        }
        if (isSortAscending == true)
            quickSortAscending(0, size - 1);
        else
            quickSortDescending(0, a.length - 1);
        replaceList();
    }

    private void replaceList() {
        clear();
        for (int i = 0; i < a.length; i++) {
            add(a[i]);
        }
    }

    private void quickSortAscending(int left, int right) {
        int pivot = left;
        int i = left;

        for (int j = left + 1; j <= right; j++)
            if (a[j] < a[pivot]) {
                i++;
                if (i < j) {
                    int t = a[i];
                    a[i] = a[j];
                    a[j] = t;
                }
            }
        int t = a[i];
        a[i] = a[pivot];
        a[pivot] = t;

        if (i > left)
            quickSortAscending(left, i - 1);
        if (i < right)
            quickSortAscending(i + 1, right);
    }

    private void quickSortDescending(int left, int right) {
        int pivot = left;
        int i = left;

        for (int j = left + 1; j <= right; j++)
            if (a[j] > a[pivot]) {
                i++;
                if (i < j) {
                    int t = a[i];
                    a[i] = a[j];
                    a[j] = t;
                }
            }
        int t = a[i];
        a[i] = a[pivot];
        a[pivot] = t;

        if (i > left)
            quickSortDescending(left, i - 1);
        if (i < right)
            quickSortDescending(i + 1, right);
    }

    /**
     * Get the list
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
