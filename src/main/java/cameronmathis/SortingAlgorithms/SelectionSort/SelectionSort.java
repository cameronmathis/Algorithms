package cameronmathis.SortingAlgorithms.SelectionSort;

import static cameronmathis.utils.ArrayUtil.printArray;

public class SelectionSort {
    
    public void sort(int[] arr) {
        int n = arr.length;
        // One by one move boundary of unsorted sub-array
        for (int i = 0; i < n - 1; i++) {
            // Find the minimum element in unsorted array
            int min_idx = i;
            for (int j = i + 1; j < n; j++)
                if (arr[j] < arr[min_idx]) {
                    min_idx = j;
                }
            // Swap the found minimum element with the first element
            int temp = arr[min_idx];
            arr[min_idx] = arr[i];
            arr[i] = temp;
        }
    }

    public static void main(String[] args) {
        SelectionSort ob = new SelectionSort();
        int[] arr = {3, 2, 5, 1, 4};
        System.out.print("Given array: ");
        printArray(arr);
        ob.sort(arr);
        System.out.print("Sorted array: ");
        printArray(arr);
    }
}
