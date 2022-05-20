package cameronmathis.SearchingAlgorithms.RecursiveBinarySearch;

import static cameronmathis.utils.ArrayUtil.printArray;

public class RecursiveBinarySearch {

    /**
     * Returns index of x if it is present in arr[l..r], else return -1
     *
     * @param arr the array to be searched
     * @param l   the left index of the array
     * @param r   the right index of the array
     * @param x   the element to be searched for
     * @return int
     */
    public int search(int[] arr, int l, int r, int x) {
        if (r >= l) {
            int mid = l + (r - l) / 2;
            // If the element is present at the middle itself
            if (arr[mid] == x) {
                return mid;
            }
            // If element is smaller than mid, then it can only be present in left sub-array
            else if (arr[mid] > x) {
                return search(arr, l, mid - 1, x);
            }
            // Else the element can only be present in right sub-array
            else {
                return search(arr, mid + 1, r, x);
            }
        }
        // If we reach here, the element was not present
        return -1;
    }

    public static void main(String[] args) {
        RecursiveBinarySearch ob = new RecursiveBinarySearch();
        int[] arr = {1, 2, 3, 4, 7, 8};
        int elementToFind = 7;
        System.out.print("Given array: ");
        printArray(arr);
        System.out.println("Element to find: " + elementToFind);
        int result = ob.search(arr, 0, arr.length - 1, elementToFind);
        if (result == -1) {
            System.out.println("Element not present");
        } else {
            System.out.println("Element found at index " + result);
        }
    }
}