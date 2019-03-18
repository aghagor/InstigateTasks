import java.lang.reflect.Array;
import java.util.Arrays;

public class FindMissingNumber {
    public static void main(String[] args) {
        int[] array = {5, 3, 4, 1, 6, 9, 7, 0};
        int count = 0;
        Arrays.sort(array);
        for (int i = 0; i < array.length - 1; i++) {
            if (array[i + 1] - array[i] == 1) {
                count++;
            } else if (array[i + 1] - array[i] > 1) {
                int missingNumber = array[i + 1] - 1;
                System.out.println("Missing number between " + array[i] + " and " + array[i + 1]
                        + " : Missing number is " + missingNumber);
            }
        }
    }
}
