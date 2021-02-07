package basic;

public class ArraysCodelab03 {

    public static void main(String[] args) {
        System.out.println(getSize(new int[]{1, 2, 3, 4}));
        System.out.println(getElementAt(1, new int[]{1, 2, 3, 4, 5}));
        System.out.println(getElementAtRealIndex(1, new int[]{1, 2, 3, 4, 5}));
        System.out.println(getElementAtSumOfIndexes(2, 3, new int[]{1, 2, 3, 4, 5, 6, 7}));
    }

    /**
     * Implement this method so that it returns the size of the given array.
     */
    public static int getSize(int[] input) {
        return 0;
    }

    /**
     * 1. Implement this method so that it returns the element at index index in the array.
     * 2. If there is no element at index in the array (the index is either too small or too big) return 0.
     * <p>
     * Hint!
     * Concentrate on the initial requirement first. Ignore the second one until the first one works.
     * This is called "making sure that the happy path works first".
     * A happy path is the case where everything can work according to plan (nobody is calling the method with a weird index).
     * <p>
     * Afterwards you can add code that deals with the exceptional cases.
     * The block of code you write for this is typically called a guard-clause and is put at the top of the method.
     */
    public static int getElementAt(int index, int[] array) {
        return 0;
    }


    /**
     * Indexes in arrays can be confusing, since we start counting from 0.
     * Implement the previous method so that we start counting from 1.
     * So if you get the element at index 1, you'll get the first element in the array.
     * <p>
     * If the index is too big or too small return 0
     */
    public static int getElementAtRealIndex(int index, int[] array) {
        return 0;
    }

    /**
     * Implement this method so that it return the element found at the index that is the sum of index1 and index2 in array.
     * So getElementAtSumOfIndexes(1, 1, new int[]{10, 21, 45}); will return 45. Since 1 + 1 = 2 and the element in array at index 2 is 45.
     * If the sum of index1 and index2 is either too big or too small return 0.
     * <p>
     * Hint: you can reuse the getElementAt function instead of writing new if's, to check if the sum is too big or too small.
     */
    public static int getElementAtSumOfIndexes(int index1, int index2, int[] array) {
        return 0;
    }

}
