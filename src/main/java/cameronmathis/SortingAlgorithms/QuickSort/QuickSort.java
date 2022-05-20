package cameronmathis.SortingAlgorithms.QuickSort;

import static cameronmathis.utils.ArrayUtil.printArray;

public class QuickSort {

    /**
     * This function takes last element as pivot,
     * places the pivot element at its correct
     * position in sorted array, and places all
     * smaller (smaller than pivot) to left of
     * pivot and all greater elements to right
     * of pivot
     */
    private int partition(int[] arr, int low, int high) {
        int pivot = arr[high];
        int i = (low - 1); // The index of smaller element
        for (int j = low; j < high; j++) {
            // If current element is smaller than the pivot
            if (arr[j] < pivot) {
                i++;
                // Swap arr[i] and arr[j]
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
            }
        }
        // Swap arr[i+1] and arr[high] (or pivot)
        int temp = arr[i + 1];
        arr[i + 1] = arr[high];
        arr[high] = temp;

        return i + 1;
    }

    /**
     * The main function that implements Quick Sort
     *
     * @param arr  the array to be sorted
     * @param low  the starting index
     * @param high the ending index
     */
    public void sort(int[] arr, int low, int high) {
        if (low < high) {
            // pi is the partitioning index, arr[pi] is now at the right place
            int pi = partition(arr, low, high);
            // Recursively sort elements before and after partition
            sort(arr, low, pi - 1);
            sort(arr, pi + 1, high);
        }
    }

    public static void main(String[] args) {
        QuickSort ob = new QuickSort();
        int[] arr = {3, 2, 5, 1, 4};
        System.out.print("Given array: ");
        printArray(arr);
        ob.sort(arr, 0, arr.length - 1);
        System.out.print("Sorted array: ");
        printArray(arr);
    }
}
