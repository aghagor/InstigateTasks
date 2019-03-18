public class FindSingleElement {
    private static int[] sort(int[] array) {
        for (int i = 0; i < array.length - 1; i++) {
            for (int j = 0; j < array.length - i - 1; j++) {
                if (array[j] < array[j + 1]) {
                    int temp = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = temp;
                }
            }
        }
        return array;
    }

    private static void search(int[] array, int low, int high) {
        if (low > high) {
            return;
        }
        if (low == high) {
            System.out.println("The number is -> " + array[low]);
            return;
        }
        int middle = (low + high) / 2;

        if (middle % 2 == 0) {
            if (array[middle] == array[middle + 1]) {
                search(array, middle + 2, high);
            } else search(array, low, middle);
        }
        if (middle % 2 == 1) {
            if (array[middle] == array[middle - 1]) {
                search(array, middle + 1, high);
            } else search(array, low, middle - 1);
        }

    }

    public static void main(String[] args) {
        int[] array = {1, 2, 3, 1, 4, 2, 4};
        sort(array);
        search(array, 0, array.length - 1);

    }
}
