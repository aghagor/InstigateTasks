public class BinarySearch {
    private static int binarySearch(int[] arr, int number) {
        int lenght = 0;
        int arrayLenght = arr.length - 1;
        while (lenght <= arrayLenght) {
            int i = lenght + (arrayLenght - lenght) / 2;
            if (arr[i] == number) return i;
            if (arr[i] < number) lenght = i + 1;
            else arrayLenght = i - 1;
        }
        return -1;
    }

    public static void main(String[] args) {
        int [] arr = {};
        System.out.println(binarySearch(arr,2));
    }
}


