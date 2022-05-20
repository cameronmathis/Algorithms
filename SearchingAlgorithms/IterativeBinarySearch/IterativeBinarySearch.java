package IterativeBinarySearch;

public class IterativeBinarySearch {
    // Returns index of x if it is present in arr[l..
    // r], else return -1
    public int search(int arr[], int l, int r, int x) {
        while (l <= r) {
            int m = l + (r - l) / 2;

            // Check if x is present at mid
            if (arr[m] == x)
                return m;

            // If x greater, ignore left half
            if (arr[m] < x)
                l = m + 1;

            // If x is smaller, ignore right half
            else
                r = m - 1;
        }

        // if we reach here, then element was
        // not present
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
        IterativeBinarySearch ob = new IterativeBinarySearch();
        int arr[] = { 1, 2, 3, 4, 7, 8 };
        int elementToFind = 7;
        System.out.print("Given array: ");
        ob.printArray(arr);
        System.out.println("Element to find: " + elementToFind);
        int index = ob.search(arr, 0, arr.length - 1, elementToFind);
        if (index == -1)
            System.out.println("Element not present");
        else
            System.out.println("Element found at index " + index);
    }
}