package cameronmathis.SortingAlgorithms.MergeSort;

import static cameronmathis.utils.ArrayUtil.printArray;

public class MergeSort {

    /**
     * Merges two sub-arrays of arr[]
     * First sub-array is arr[l..m]
     * Second sub-array is arr[m+1..r]
     */
    private void merge(int[] arr, int l, int m, int r) {
        // Find sizes of two sub-arrays to be merged
        int n1 = m - l + 1;
        int n2 = r - m;
        // Create temp arrays
        int[] L = new int[n1];
        int[] R = new int[n2];
        // Copy data to temp arrays
        System.arraycopy(arr, l, L, 0, n1);
        for (int j = 0; j < n2; ++j) {
            R[j] = arr[m + 1 + j];
        }
        // Merge the temp arrays
        // Initial indexes of first and second sub-arrays
        int i = 0, j = 0;
        // Initial index of merged sub-array array
        int k = l;
        while (i < n1 && j < n2) {
            if (L[i] <= R[j]) {
                arr[k] = L[i];
                i++;
            } else {
                arr[k] = R[j];
                j++;
            }
            k++;
        }
        // Copy remaining elements of L[] if any
        while (i < n1) {
            arr[k] = L[i];
            i++;
            k++;
        }
        // Copy remaining elements of R[] if any
        while (j < n2) {
            arr[k] = R[j];
            j++;
            k++;
        }
    }
    
    public void sort(int[] arr, int l, int r) {
        if (l < r) {
            // Find the middle point
            int m = (l + r) / 2;
            // Sort first and second halves
            sort(arr, l, m);
            sort(arr, m + 1, r);
            // Merge the sorted halves
            merge(arr, l, m, r);
        }
    }

    public static void main(String[] args) {
        MergeSort ob = new MergeSort();
        int[] arr = {3, 2, 5, 1, 4};
        System.out.print("Given array: ");
        printArray(arr);
        ob.sort(arr, 0, arr.length - 1);
        System.out.print("Sorted array: ");
        printArray(arr);
    }
}
