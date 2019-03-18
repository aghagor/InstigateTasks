import java.util.Arrays;

public class GetMaxAndMin {
    private static int max = 0;
    private static int min = 0;

    public static int getMax(int[] array) {
        for (int i = 0; i < array.length; i++) {
            if (array[i] > max)
                max = array[i];
        }
        return max;
    }

    public static int getMin(int[] array) {
        for (int i = 0; i < array.length; i++) {
            for (int j = i + 1; j < array.length; j++) {
                if (array[i] > array[j]) {
                    int temp = array[i];
                    array[i] = array[j];
                    array[j] = temp;
                }
            }
        }
        min = array[0];
        return min;
    }

    public static void main(String[] args) {
        int[] givvenArray = {5, 8, 4, 6, 7, 2, 3, 1, 14, 11, 65, 24, 23, 19, 15};
        System.out.println(Arrays.toString(givvenArray));
        System.out.println("The largest element is " + getMax(givvenArray));
        System.out.println("The smallest element is " + getMin(givvenArray));
    }
}
