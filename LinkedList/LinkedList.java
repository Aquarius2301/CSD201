public class MyList {
    private int size = 0; // The size of the list
    private int[] a;
    Node head; // the first node
    Node tail; // the last node

    /**
     * Create a list with size = 0
     */
    public MyList() {
        head = tail = null;
        size = 0;
    }

    /**
     * Create a list with size (all elements are 0s)
     */
    public MyList(int size) {
        for (int index = 0; index < size; index++) {
            add(0);
        }
    }

    /**
     * Create a list and put all elements from arr to the list
     */
    public MyList(int[] arr) {
        for (int index = 0; index < arr.length; index++) {
            add(arr[index]);
        }
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
            tail.setNext(newNode);
            tail = tail.getNext();
        }
        size++;
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
            head = newNode;
        }
        size++;
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
     * Insert a value at index
     * <p>
     * Throw exception if the index is out of range [0, size]
     * 
     * @param index the index
     * @param value the value
     */
    public void insert(int index, int value) {
        if (index < 0 || index > size)
            throw new NullPointerException();
        if (index == size)
            addLast(value);
        else if (index == 0)
            addFirst(value);
        else {
            Node x = head;
            Node newNode = new Node(value);
            for (int i = 0; i < index - 1; i++) {
                x = x.getNext();
            }
            newNode.setNext(x.getNext());
            x.setNext(newNode);
        }
        size++;
    }

    /**
     * Remove the first element of the list
     * <p>
     * This code is equivalent to {@code removeAt(0)}
     */
    public void removeFirst() {
        if (!isEmpty()) {
            head = head.getNext();
            size--;
        }
    }

    /**
     * Remove the last element of the list
     * <p>
     * This code is equivalent to {@code removeAt(size-1)}
     */
    public void removeLast() {
        if (!isEmpty()) {
            Node x = head;
            for (int i = 0; i < size - 2; i++) {
                x = x.getNext();
            }
            tail = x;
            tail.setNext(null);
            size--;
        }
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
        if (index == 0)
            removeFirst();
        else if (index == size - 1)
            removeLast();
        else {
            Node x = head;
            for (int i = 0; i < index - 1; i++) {
                x = x.getNext();
            }
            x.setNext(x.getNext().getNext());
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
     * Remove all elements of the list
     */
    public void clear() {
        head = tail = null;
        size = 0;
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
        Node x = head;
        for (int i = 0; i < index; i++) {
            x = x.getNext();
        }
        return x.getValue();
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
        do {
            if (currentNode.getValue() == value)
                return index;
            currentNode = currentNode.getNext();
            index++;
        } while (currentNode != null);
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
        int i = 0;
        int index = -1;
        Node currentNode = head;
        do {
            if (currentNode.getValue() == value)
                index = i;
            currentNode = currentNode.getNext();
            i++;
        } while (currentNode != null);
        return index;
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
     * return the size of the list
     * 
     * @return the size of the list
     */
    public int size() {
        return size;
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
        if (index < 0 || index > size - 1)
            throw new NullPointerException();
        Node currentNode = head;
        for (int i = 0; i < index; i++) {
            currentNode = currentNode.getNext();
        }
        currentNode.setValue(value);
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
