package cameronmathis.SearchingAlgorithms.LinearSearch;

import static cameronmathis.utils.ArrayUtil.printArray;

public class LinearSearch {

    /**
     * @param arr             the array to be searched
     * @param elementToSearch the element to be searched for
     * @return int
     */
    public int search(int[] arr, int elementToSearch) {
        for (int index = 0; index < arr.length; index++) {
            if (arr[index] == elementToSearch) {
                return index;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        LinearSearch ob = new LinearSearch();
        int[] arr = {3, 2, 5, 1, 4};
        int elementToFind = 1;
        System.out.print("Given array: ");
        printArray(arr);
        System.out.println("Element to find: " + elementToFind);
        int result = ob.search(arr, elementToFind);
        if (result == -1) {
            System.out.println("Element not present");
        } else {
            System.out.println("Element found at index " + result);
        }
    }
}