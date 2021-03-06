import java.util.Arrays;

public class ThreeLargestOnArray {
    private static int first;
    private static int second;
    private static int third;

    private static int[] printTheThreeLargest(int originalArray[], int arraySize) {
        if (arraySize < 3) {
            System.out.print(" Invalid Input ");
        }
        for (int i = 0; i < arraySize; i++) {
            if (originalArray[i] > first) {
                third = second;
                second = first;
                first = originalArray[i];
            } else if (originalArray[i] > second) {
                third = second;
                second = originalArray[i];
            } else if (originalArray[i] > third)
                third = originalArray[i];
        }
        int[] newArray = {first, second, third};
        return newArray;
    }

    private static int[] printTheTwoLargest(int originalArray[], int arraySize) {
        if (arraySize < 2) {
            System.out.print(" Invalid Input ");
        }
        for (int i = 0; i < arraySize; i++) {
            if (originalArray[i] > first) {
                second = first;
                first = originalArray[i];
            } else if (originalArray[i] > second) {
                second = originalArray[i];
            }
        }
        int[] newArray = {first, second};
        return newArray;
    }

    public static void main(String[] args) {
        int[] arr = {1, 4, 17, 7, 25, 3, 100};
        System.out.println("Original array -> " + Arrays.toString(arr));
        int n = arr.length;
//        int[] array = printTheThreeLargest(arr, n);
//        System.out.println("Array with 3 biggest numbers -> " + Arrays.toString(array));
        int[] array2 = printTheTwoLargest(arr, n);
        System.out.println("Array with 2 biggest numbers -> " + Arrays.toString(array2));
    }
}
