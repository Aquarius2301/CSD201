import java.util.Arrays;

/**
 * @author Khang Ta
 */
public class MyArray {
    private int[] a;

    /**
     * Create an array with size = 0
     */
    public MyArray() {
        a = new int[0];
    }

    /**
     * Create an array with size element
     * <p>
     * Start with 0 and last with size - 1
     * 
     * @param size the size of the array
     */
    public MyArray(int size) {
        a = new int[size];
    }

    /**
     * Create an array and put all elements from {@code a} into this array
     * 
     * @param a the array
     */
    public MyArray(int[] a) {
        this.a = a;
    }

    /**
     * Add a value at the last index
     * <p>
     * This code is equivalent to {@code addLast(value)}
     * <p>
     * Ex: a[3, 4, 7, 1, 8] then we use {@code a.add(0)}
     * <p>
     * =>a[3, 4, 7, 1, 8, 0]
     * 
     * @param value the value you want to add
     */
    public void add(int value) {
        addLast(value);
    }

    /**
     * Add a value at the last index
     * <p>
     * This code is equivalent to {@code add(value)}
     * <p>
     * Ex: a[3, 4, 7, 1, 8] then we use {@code a.addLast(0)}
     * <p>
     * =>a[3, 4, 7, 1, 8, 0]
     * 
     * @param value the value you want to add
     */
    public void addLast(int value) {
        int[] b = new int[a.length + 1];
        for (int i = 0; i < a.length; i++) {
            b[i] = a[i];
        }
        b[b.length - 1] = value;
        a = b;
    }

    /**
     * Add a value at the first index
     * <p>
     * Ex: a[3, 4, 7, 1, 8] then we use{@code a.addFirst(0)}
     * <p>
     * =>a[0, 3, 4, 7, 1, 8]
     * 
     * @param value
     */
    public void addFirst(int value) {
        int[] b = new int[a.length + 1];
        for (int i = b.length - 1; i > 0; i--) {
            b[i] = a[i - 1];
        }
        b[0] = value;
        a = b;
    }

     /**
     * Check if the array is empty
     * 
     * @return {@code true} if the array is empty
     *         <p>
     *         {@code false} if the array is not empty
     */
    public boolean isEmpty() {
        return a.length = 0;
    }

    /**
     * Get the size of the array
     * <p>
     * The size of an array is the last index + 1
     * 
     * @return the size of the array
     */
    public int size() {
        return a.length;
    }

    /**
     * Sort the array ascending
     * <p>
     * This code is equivalent to {@code sort(true)}
     */
    public void sort() {
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
        if (isSortAscending == true)
            quickSortAscending(0, a.length - 1);
        else
            quickSortDescending(0, a.length - 1);
    }

    /**
     * Find the value in the array from first index to last index
     * 
     * @param value the value want to find
     * @return the index contain the value. If there are more than one element same
     *         value, take the first one
     *         <p>
     *         -1 if not found
     */
    public int indexOf(int value) {
        for (int i = 0; i < a.length; i++) {
            if (a[i] == value)
                return i;
        }
        return -1;
    }

    /**
     * Find the value in the array from last index to first index
     * 
     * @param value the value want to find
     * @return the index contain the value. If there are more than one element same
     *         value, take the last one
     *         <p>
     *         -1 if not found
     */
    public int lastIndexOf(int value) {
        for (int i = a.length - 1; i >= 0; i--) {
            if (a[i] == value)
                return i;
        }
        return -1;
    }

    /**
     * Clear all value in the array
     */
    public void clear() {
        a = new int[0];
    }

    /**
     * Insert a number at index
     * Throw Exception if index is out of range [0, size]
     * 
     * @param value the value want to insert
     * @param index the index you want to insert this value
     */
    public void insert(int value, int index) {
        int[] b = new int[a.length + 1];
        for (int i = 0; i < a.length; i++) {
            b[i] = a[i];
        }
        for (int i = b.length - 1; i > index; i--) {
            b[i] = b[i - 1];
        }
        b[index] = value;
        a = b;
    }

    /**
     * Remove a value at index
     * <p>
     * Throw Exception if the index is out of range [0, size - 1]
     * 
     * @param index the index you want to remove
     */
    public void removeAt(int index) {
        int[] b = new int[a.length - 1];

        for (int i = 0; i < index; i++) {
            b[i] = a[i];
        }

        for (int i = index + 1; i < a.length; i++) {
            b[i - 1] = a[i];
        }
        a = b;
    }

    /**
     * Remove a value
     * <p>
     * If the value is not in the list, do nothing
     * 
     * @param value the value want to remove
     */
    public void remove(int value) {
        int index = indexOf(value);
        if (index != -1) {
            removeAt(index);
        }
    }

    /**
     * Check if the array has the value
     * 
     * @param value the value want to find
     * @return {@code true} if the value is in the array
     *         <p>
     *         {@code false} if the value is not in the array
     */
    public boolean contains(int value) {
        return (indexOf(value) == -1) ? false : true;
    }

    /**
     * Get the value at index
     * 
     * @param index the index want to get
     * @return the value at index
     */
    public int get(int index) {
        return a[index];
    }

    /**
     * Replace a value in the array at index
     * <p>
     * Throw Exception if index is out of range [0, size - 1]
     */
    public void replace(int value, int index) {
        a[index] = value;
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
     * Show the array
     * 
     * @return the array
     */
    @Override
    public String toString() {
        return Arrays.toString(a);
    }
}
