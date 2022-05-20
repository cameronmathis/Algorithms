package cameronmathis.SearchingAlgorithms;

import cameronmathis.SearchingAlgorithms.IterativeBinarySearch.IterativeBinarySearch;
import cameronmathis.SearchingAlgorithms.LinearSearch.LinearSearch;
import cameronmathis.SearchingAlgorithms.RecursiveBinarySearch.RecursiveBinarySearch;

import static cameronmathis.utils.ArrayUtil.getArray;

public class Main {

    public static void main(String[] args) {
        // Check for the correct number of args
        if (args.length != 2) {
            throw new IllegalArgumentException("Parameter(s): <Array> <Element>");
        }

        // Store command line arguments
        int[] arr = getArray(args[0]);
        int elementToFind = Integer.parseInt(args[1]);

        // Declare variables for measuring time
        long start;
        long finish;

        // Declare variable to remember index
        int index;

        System.out.println();

        // Iterative Binary Search
        IterativeBinarySearch iterativeBinarySearch = new IterativeBinarySearch();
        start = System.nanoTime();
        index = iterativeBinarySearch.search(arr, 0, arr.length - 1, elementToFind);
        finish = System.nanoTime();
        System.out.println("Iterative Binary Search time: " + (finish - start) + " ns");

        // Iterative Binary Search
        LinearSearch linearSearch = new LinearSearch();
        start = System.nanoTime();
        index = linearSearch.search(arr, elementToFind);
        finish = System.nanoTime();
        System.out.println("Linear Search time: " + (finish - start) + " ns");

        // Iterative Binary Search
        RecursiveBinarySearch recursiveBinarySearch = new RecursiveBinarySearch();
        start = System.nanoTime();
        index = recursiveBinarySearch.search(arr, 0, arr.length - 1, elementToFind);
        finish = System.nanoTime();
        System.out.println("Recursive Binary Search time: " + (finish - start) + " ns");

        System.out.println("Element to find: " + elementToFind);
        if (index == -1) {
            System.out.println("Element not present");
        } else {
            System.out.println("Element found at index " + index);
        }
    }
}
