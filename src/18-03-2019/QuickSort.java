import java.util.Arrays;

public class QuickSort {

    private static void quickSort(int[] arr, int low, int high) {
        if (low < high) {
            int part = partition(arr, low, high);
            quickSort(arr, low, part - 1);
            quickSort(arr, part + 1, high);
        }
    }

    private static void swap(int[] arr, int first, int second) {
        int temp = arr[first];
        arr[first] = arr[second];
        arr[second] = temp;
    }

    private static int partition(int[] arr, int low, int high) {
        int pivot = arr[high];
        int i = (low - 1);
        for (int j = low; j < high; j++) {
            if (arr[j] <= pivot) {
                i++;
                swap(arr, i, j);
            }
        }
        swap(arr, i + 1, high);
        return i + 1;
    }

    public static void main(String[] args) {
        int[] givvenArray = {5, 8, 4, 6, 7, 2, 3, 1, 14, 11, 65, 24, 23, 19, 15};
        System.out.println(Arrays.toString(givvenArray));
        quickSort(givvenArray, 0, givvenArray.length - 1);
        System.out.println(Arrays.toString(givvenArray));
    }
}
