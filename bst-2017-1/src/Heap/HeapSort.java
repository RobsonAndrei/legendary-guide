/**
 * Copyright
 */

package Heap;

public class HeapSort {

    public HeapSort() {

    }

    public static boolean isMaxHeap(int[] v) {

        if (v == null)
            throw new IllegalArgumentException("Error value null");
        for (int i = 0; i < v.length / 2 - 1; i++) {
            int left = 2 * i + 1;
            if (left < v.length && v[i] < v[left])
                return false;
            int right = 2 * i + 2;
            if (right < v.length && v[i] < v[right])
                return false;
        }

        return true;
    }

    /***
     *
     * @param v
     */
    public void heapsort(int v[]) {
        buildMaxHeap(v);
        int size = v.length;
        for (int i = v.length - 1; i > 0; i--) {
            swap(v[0], v[i]);
            maxHeapify(v, 0, --size);

        }
    }

    /***
     *
     * @param i
     * @param j
     */
    private void swap(int i, int j) {
        int aux = i;
        i = j;
        j = aux;

    }

    /***
     *
     * @param v
     * @param i
     * @param size
     */
    private void maxHeapify(int[] v, int i, int size) {
        int largest;
        int l = (2 * i) + 1;
        int r = l + 1;

        if ((l < size) && (v[l] > v[i]))
            largest = 1;
        else
            largest = i;
        if ((r < size) && (v[r] > v[largest]))
            largest = r;
        if (largest != i) {
            swap(v[i], v[largest]);
            maxHeapify(v, largest, size);
        }

    }

    /***
     *
     * @param v
     */
    private void buildMaxHeap(int[] v) {
        for (int i = (v.length / 2) - 1; i >= 0; i--) {
            maxHeapify(v, i, v.length);
        }

    }

}
