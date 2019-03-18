package home;

import java.util.Arrays;

public class SelectionSort {

    public static void swap(int[] array, int first, int second) {
        int temp = array[first];
        array[first] = array[second];
        array[second] = temp;
    }

    public static int[] selectionSort(int[] array) {
        int i, j, minValue, minIndex = 0;
        for (i = 0; i < array.length; i++) {
            minValue = array[i];
            minIndex = i;
            for (j = i; j < array.length; j++) {
                if (array[j] < minValue) {
                    minValue = array[j];
                    minIndex = j;
                }
                System.out.println(Arrays.toString(array));
            }
            if (minValue < array[i])
                swap(array, i, minIndex);
        }
        return array;
    }
    public static void main(String[] args) {
        int[] givvenArray = {5, 8, 4, 6, 7, 2, 3, 1, 14, 11, 65, 24, 23, 19, 15};
        System.out.println(Arrays.toString(givvenArray));
        System.out.println(Arrays.toString(selectionSort(givvenArray)));
    }
}
