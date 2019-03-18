import java.util.Arrays;

public class TopTwoNumbers {
    private static int first = 0;
    private static int second = 0;

    private int[] twoBiggestNumbers(int[] array) {
        for (int i = 0; i < array.length - 1; i++) {
            if (array[i] > first) {
                second = first;
                first = array[i];
            }
            else if (array[i] > second) {
                second = array[i];
            }
        }

        int[] intArray = {first,second};
        return intArray;
    }

    public static void main(String[] args) {
        int[] givvenArray = {5, 8, 4, 6, 7, 2, 3, 1, 14, 11, 65, 24, 23, 19, 15};
        System.out.println(Arrays.toString(givvenArray));
        TopTwoNumbers ttn = new TopTwoNumbers();
        int [] array =ttn.twoBiggestNumbers(givvenArray);
        System.out.println(Arrays.toString(array));
    }

}
