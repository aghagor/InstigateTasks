package home;

import java.util.Arrays;

public class BubbleSort {
    public static int[] bubbleSort(int [] array){
        for (int i = 0; i < array.length - 1; i++) {
            for (int j = 0; j <array.length-i-1; j++) {
                if (array[j]>array[j+1]){
                    swap(array,j,j+1);
                    System.out.println(Arrays.toString(array));
                }
            }
        }
        return array;
    }

    public static void swap(int [] array, int first, int second){
        int temp = array[first];
        array[first] = array[second];
        array[second] = temp;
    }

    public static void main(String[] args) {
        int[] givvenArray = {5, 8, 4, 6, 7, 2, 3, 1, 14, 11, 65, 24, 23, 19, 15};
        System.out.println(Arrays.toString(givvenArray));
        System.out.println(Arrays.toString(bubbleSort(givvenArray)));
    }
}
