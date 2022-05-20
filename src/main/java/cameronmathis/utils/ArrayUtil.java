package cameronmathis.utils;

import java.util.Random;

public class ArrayUtil {

    private ArrayUtil() {
        throw new IllegalStateException("Utility Class");
    }

    public static void printArray(int[] arr) {
        for (int j : arr) System.out.print(j + " ");
        System.out.println();
    }

    /**
     * Get an array of random integers and given size
     *
     * @param size the size of the array
     * @param seed the seed used to generate random integers
     * @return int[]
     */
    public static int[] getArray(int size, int seed) {
        int[] arr = new int[size];
        Random rand = new Random(seed);
        for (int i = 0; i < size; i++) {
            arr[i] = rand.nextInt(size);
        }
        return arr;
    }

    /**
     * Get an array of integers from a string of comma separated integers
     *
     * @param input the string of integers
     * @return int[]
     */
    public static int[] getArray(String input) {
        String[] stringArr = input.split(",");
        int[] arr = new int[stringArr.length];
        for (int i = 0; i < stringArr.length; i++) {
            try {
                arr[i] = Integer.parseInt(stringArr[i]);
            } catch (Exception e) {
                throw new IllegalArgumentException("Array must contain only integers");
            }
        }
        return arr;
    }
}
