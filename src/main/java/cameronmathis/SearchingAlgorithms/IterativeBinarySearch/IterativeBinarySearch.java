package cameronmathis.SearchingAlgorithms.IterativeBinarySearch;

import static cameronmathis.utils.ArrayUtil.printArray;

public class IterativeBinarySearch {

    /**
     * Finds the index of x if it is present in the arr[l..r], else returns -1
     *
     * @param arr the array to be searched
     * @param l   the left index of the array
     * @param r   the right index of the array
     * @param x   the element to be searched for
     * @return int
     */
    public int search(int[] arr, int l, int r, int x) {
        while (l <= r) {
            int m = l + (r - l) / 2;
            // Check if x is present at mid
            if (arr[m] == x) {
                return m;
            }
            // If x greater, ignore left half
            else if (arr[m] < x) {
                l = m + 1;
            }
            // If x is smaller, ignore right half
            else {
                r = m - 1;
            }
        }
        // If we reach here, the element was not present
        return -1;
    }

    public static void main(String[] args) {
        IterativeBinarySearch ob = new IterativeBinarySearch();
        int[] arr = {1, 2, 3, 4, 7, 8};
        int elementToFind = 7;
        System.out.print("Given array: ");
        printArray(arr);
        System.out.println("Element to find: " + elementToFind);
        int index = ob.search(arr, 0, arr.length - 1, elementToFind);
        if (index == -1) {
            System.out.println("Element not present");
        } else {
            System.out.println("Element found at index " + index);
        }
    }
}