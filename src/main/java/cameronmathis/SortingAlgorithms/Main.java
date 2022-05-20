package cameronmathis.SortingAlgorithms;

import cameronmathis.SortingAlgorithms.BubbleSort.BubbleSort;
import cameronmathis.SortingAlgorithms.HeapSort.HeapSort;
import cameronmathis.SortingAlgorithms.InsertionSort.InsertionSort;
import cameronmathis.SortingAlgorithms.MergeSort.MergeSort;
import cameronmathis.SortingAlgorithms.QuickSort.QuickSort;
import cameronmathis.SortingAlgorithms.SelectionSort.SelectionSort;

import static cameronmathis.utils.ArrayUtil.getArray;
import static cameronmathis.utils.ArrayUtil.printArray;

public class Main {

    public static void main(String[] args) {
        // Check for the correct number of args
        if (args.length != 2) {
            throw new IllegalArgumentException("Parameter(s): <Array Size> <Show/Hide Array>");
        }
        // Create array to sort
        int size;
        try {
            size = Integer.parseInt(args[0]);
        } catch (Exception e) {
            throw new IllegalArgumentException("Parameter(s): <Array Size> <Show/Hide Array>");
        }
        if (size < 0) {
            throw new IllegalArgumentException("Parameter(s): <Array Size> <Show/Hide Array>");
        }
        int seed = (int) System.currentTimeMillis();
        int[] arr = getArray(size, seed);
        // Decide is array should be printed to console
        String showParameter = args[1].toLowerCase();
        boolean doShowArray;
        if (showParameter.equals("show")) {
            doShowArray = true;
        } else if (showParameter.equals("hide")) {
            doShowArray = false;
        } else {
            throw new IllegalArgumentException("Parameter(s): <Array Size> <Show/Hide Array>");
        }

        if (doShowArray) {
            System.out.print("Unsorted Array: ");
            printArray(arr);
        }
        System.out.println();
        // Declare variables for measuring time
        long start;
        long finish;
        // Bubble sort
        BubbleSort bubbleSort = new BubbleSort();
        start = System.nanoTime();
        bubbleSort.sort(arr);
        finish = System.nanoTime();
        System.out.println("Bubble sort time: " + (finish - start) + " ns");
        // Heap sort
        HeapSort heapSort = new HeapSort();
        arr = getArray(size, seed);
        start = System.nanoTime();
        heapSort.sort(arr);
        finish = System.nanoTime();
        System.out.println("Heap sort time: " + (finish - start) + " ns");
        // Insertion sort
        InsertionSort insertionSort = new InsertionSort();
        arr = getArray(size, seed);
        start = System.nanoTime();
        insertionSort.sort(arr);
        finish = System.nanoTime();
        System.out.println("Insertion sort time: " + (finish - start) + " ns");
        // Merge sort
        MergeSort mergeSort = new MergeSort();
        arr = getArray(size, seed);
        start = System.nanoTime();
        mergeSort.sort(arr, 0, arr.length - 1);
        finish = System.nanoTime();
        System.out.println("Merge sort time: " + (finish - start) + " ns");
        // Quick sort
        QuickSort quickSort = new QuickSort();
        arr = getArray(size, seed);
        start = System.nanoTime();
        quickSort.sort(arr, 0, arr.length - 1);
        finish = System.nanoTime();
        System.out.println("Quick sort time: " + (finish - start) + " ns");
        // Selection sort
        SelectionSort selectionSort = new SelectionSort();
        arr = getArray(size, seed);
        start = System.nanoTime();
        selectionSort.sort(arr);
        finish = System.nanoTime();
        System.out.println("Selection sort time: " + (finish - start) + " ns");

        System.out.println();
        if (doShowArray) {
            System.out.print("Sorted array: ");
            printArray(arr);
        }
    }
}
