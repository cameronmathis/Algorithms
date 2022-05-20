package RecursiveBinarySearch;

public class RecursiveBinarySearch {
    // Returns index of x if it is present in arr[l..
    // r], else return -1
    public int search(int arr[], int l, int r, int x) {
        if (r >= l) {
            int mid = l + (r - l) / 2;

            // If the element is present at the
            // middle itself
            if (arr[mid] == x)
                return mid;

            // If element is smaller than mid, then
            // it can only be present in left subarray
            if (arr[mid] > x)
                return search(arr, l, mid - 1, x);

            // Else the element can only be present
            // in right subarray
            return search(arr, mid + 1, r, x);
        }

        // We reach here when element is not present
        // in array
        return -1;
    }

    // Prints the array
    private void printArray(int arr[]) {
        int n = arr.length;
        for (int i = 0; i < n; ++i)
            System.out.print(arr[i] + " ");
        System.out.println();
    }

    // Driver code to test above
    public static void main(String args[]) {
        RecursiveBinarySearch ob = new RecursiveBinarySearch();
        int arr[] = { 1, 2, 3, 4, 7, 8 };
        int elementToFind = 7;
        System.out.print("Given array: ");
        ob.printArray(arr);
        System.out.println("Element to find: " + elementToFind);
        int result = ob.search(arr, 0, arr.length - 1, elementToFind);
        if (result == -1)
            System.out.println("Element not present");
        else
            System.out.println("Element found at index " + result);
    }
}