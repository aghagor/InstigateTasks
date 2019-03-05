import java.util.Arrays;

class QuickSort {
    int partition(int arr[], int low, int high) {
        int pivot = arr[high];
        int i = (low - 1);
        for (int j = low; j < high; j++) {
            if (arr[j] <= pivot) {
                i++;
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
            }
        }
        int temp = arr[i + 1];
        arr[i + 1] = arr[high];
        arr[high] = temp;

        return i + 1;
    }
    void sort(int arr[], int startedIndex, int endingIndex) {
        if (startedIndex < endingIndex) {
            int pi = partition(arr, startedIndex, endingIndex);
            sort(arr, startedIndex, pi - 1);
            sort(arr, pi + 1, endingIndex);
        }
    }
    public static void main(String args[]) {
        int arr[] = {10, 7, 8, 9, 1, 5, 5, 6, 4, 8, 10, 95, 1};
        int n = arr.length;

        QuickSort quickSort = new QuickSort();
        quickSort.sort(arr, 0, n - 1);

        System.out.println("sorted array");
        System.out.println(Arrays.toString(arr));
    }
}
