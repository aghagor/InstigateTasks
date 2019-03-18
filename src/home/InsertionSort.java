package home;

import java.util.Arrays;

public class InsertionSort {
    public static void swap(int[] array, int first, int second) {
        int temp = array[first];
        array[first] = array[second];
        array[second] = temp;
    }

    public static int[] insertionSort(int[] array) {
        int i, j, key = 0;
        for (i = 1; i < array.length; i++) {
            key = array[i];
            j = i - 1;
            while (j >= 0 && array[j] > key) {
                swap(array, j, j + 1);
                j--;
            }
            System.out.println(Arrays.toString(array));
        }
        return array;
    }

    public static void main(String[] args) {
        int[] givvenArray = {5, 8, 4, 6, 7, 2, 3, 1, 14, 11, 65, 24, 23, 19, 15};
        System.out.println(Arrays.toString(givvenArray));
        System.out.println(Arrays.toString(insertionSort(givvenArray)));
    }
}
