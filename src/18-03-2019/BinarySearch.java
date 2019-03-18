public class BinarySearch {
    static int binarySearch(int arr[], int left, int right, int number) {
        if (right >= left) {
            int mid = left + (right - left) / 2;
            if (arr[mid] == number)
                return mid;
            if (arr[mid] > number)
                return binarySearch(arr, left, mid - 1, number);
            return binarySearch(arr, mid + 1, right, number);
        }
        return -1;
    }

    private static void swap(int[] array, int firstIndex, int secondIndex) {
        int temp = array[firstIndex];
        array[firstIndex] = array[secondIndex];
        array[secondIndex] = temp;
    }

    private static int[] sort(int[] arr) {
        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = 0; j < arr.length - i - 1; j++) {
                if (arr[j] > arr[j + 1]) {
                    swap(arr, j, j + 1);
                }
            }
        }
        return arr;
    }

    public static void main(String[] args) {
        int[] arr = {2, 5, 4, 6, 3, 1, 48};
        sort(arr);
        System.out.println(binarySearch(arr, 0, arr.length - 1, 2));
    }
}
