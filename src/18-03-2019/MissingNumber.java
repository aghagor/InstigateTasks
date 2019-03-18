
import java.util.Arrays;

public class MissingNumber {
    private static int[] removeTheElement(int[] arr,
                                          int index) {
        if (arr == null || index < 0 || index >= arr.length) {
            return arr;
        }
        int[] anotherArray = new int[arr.length - 1];
        for (int i = 0, k = 0; i < arr.length; i++) {
            if (i == index) {
                continue;
            }
            anotherArray[k++] = arr[i];
        }
        return anotherArray;
    }

    private int[] addNumbers(int count) {
        int[] array = new int[count - 1];
        for (int i = 0; i < count - 1; i++) {
            array[i] = i;
        }
        return array;
    }

    private static int findMissingNumber(int[] array) {
        int missingNum = 0;
        for (int i = 0; i < array.length - 1; i++) {
            if (array[i + 1] - array[i] == 2) {
                missingNum = array[i] + 1;
            }
        }
        return missingNum;
    }

    public static void main(String[] args) {
        MissingNumber missingNumber = new MissingNumber();
        int[] array = missingNumber.addNumbers(10);
        int[] cArray = removeTheElement(array, 4);
        System.out.println(Arrays.toString(cArray));
        System.out.println(findMissingNumber(cArray));
    }

}
