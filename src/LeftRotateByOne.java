import java.util.Arrays;

public class LeftRotateByOne {
    static int[] array = {4, 5, 6};

    void leftRotatebyOne(int arr[]) {
        int i, temp;
        temp = arr[0];
        for (i = 0; i < arr.length - 1; i++)
            arr[i] = arr[i + 1];
        arr[i] = temp;
    }

    void printArray(int arr[]) {
        System.out.println("Rotated array -> " + Arrays.toString(arr));
    }

    public static void main(String[] args) {
        LeftRotateByOne leftRotateByOne = new LeftRotateByOne();
        System.out.println("Original array -> " + Arrays.toString(array));
        leftRotateByOne.leftRotatebyOne(array);
        leftRotateByOne.printArray(array);
    }
}
