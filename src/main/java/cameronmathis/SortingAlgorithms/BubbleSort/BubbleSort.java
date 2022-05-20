package cameronmathis.SortingAlgorithms.BubbleSort;

import static cameronmathis.utils.ArrayUtil.printArray;

public class BubbleSort {

    public void sort(int[] arr) {
        int n = arr.length;
        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - i - 1; j++) {
                if (arr[j] > arr[j + 1]) {
                    // Swap arr[j+1] and arr[j]
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
    }

    public static void main(String[] args) {
        BubbleSort ob = new BubbleSort();
        int[] arr = {3, 2, 5, 1, 4};
        System.out.print("Given array: ");
        printArray(arr);
        ob.sort(arr);
        System.out.print("Sorted array: ");
        printArray(arr);
    }
}
