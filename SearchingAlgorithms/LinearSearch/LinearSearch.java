package LinearSearch;

public class LinearSearch {
    public int search(int arr[], int elementToSearch) {
        for (int index = 0; index < arr.length; index++) {
            if (arr[index] == elementToSearch) {
                return index;
            }
        }
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
        LinearSearch ob = new LinearSearch();
        int arr[] = { 3, 2, 5, 1, 4 };
        int elementToFind = 1;
        System.out.print("Given array: ");
        ob.printArray(arr);
        System.out.println("Element to find: " + elementToFind);
        int result = ob.search(arr, elementToFind);
        if (result == -1)
            System.out.println("Element not present");
        else
            System.out.println("Element found at index " + result);
    }
}