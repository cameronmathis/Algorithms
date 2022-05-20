import IterativeBinarySearch.IterativeBinarySearch;
import LinearSearch.LinearSearch;
import RecursiveBinarySearch.RecursiveBinarySearch;

public class Main {
    // Get an array of random numbers and given size
    private static int[] getArray(String input) {
        String stringArr[] = input.split(",");
        int arr[] = new int[stringArr.length];
        for (int i = 0; i < stringArr.length; i++) {
            try {
                arr[i] = Integer.parseInt(stringArr[i]);
            } catch (Exception e) {
                throw new IllegalArgumentException("Parameter(s): <Array> <Element>");
            }
        }
        return arr;
    }

    // Driver code to show searching algorithm speed
    public static void main(String args[]) {
        if (args.length != 2) // test for correct # of args
            throw new IllegalArgumentException("Parameter(s): <Array> <Element>");

        // Store command line arguments
        int arr[] = getArray(args[0]);
        int elementToFind = Integer.parseInt(args[1]);

        // Declare variables for measuring time
        long start = 0;
        long finish = 0;

        // Declare variable to remeber index
        int index;

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
        RecursiveBinarySearch resursiveBinarySearch = new RecursiveBinarySearch();
        start = System.nanoTime();
        index = resursiveBinarySearch.search(arr, 0, arr.length - 1, elementToFind);
        finish = System.nanoTime();
        System.out.println("Recursive Binary Search time: " + (finish - start) + " ns");

        System.out.println("Element to find: " + elementToFind);
        if (index == -1)
            System.out.println("Element not present");
        else
            System.out.println("Element found at index " + index);
    }
}
