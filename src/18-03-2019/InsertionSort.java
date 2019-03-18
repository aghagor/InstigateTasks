import java.util.Arrays;

public class InsertionSort {
    private static int[] insertionSort(int[] arr) {
        int i = 0, j, key, temp = 0;
        for (i = 1; i < arr.length; i++) {
            key = arr[i];
            j = i - 1;
            while (j >= 0 && key < arr[j]) {
                temp = arr[j];
                arr[j] = arr[j + 1];
                arr[j + 1] = temp;
                j--;
            }
        }
        return arr;
    }

    public static void main(String[] args) {
        int[] givvenArray = {5, 8, 4, 6, 7, 2, 3, 1, 14, 11, 65, 24, 23, 19, 15};
        System.out.println(Arrays.toString(givvenArray));
        insertionSort(givvenArray);
        System.out.println(Arrays.toString(givvenArray));
    }
}
