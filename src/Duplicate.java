import java.time.Year;
import java.util.Arrays;

public class Duplicate {
    static int[] array = {5, 7, 4, 5, 5, 3, 5, 4};
    static int[]temp = new int[array.length];
    static int num = 0;

    public static void main(String[] args) {
        Arrays.sort(array);
        for (int i = 0; i < array.length - 1; i++) {
            if (array[i] != array[i + 1]) {
                temp[num++] = array[i];
            }
        }
        temp[num++] = array[array.length - 1];
//        for (int i = 0; i < num; i++) {
//            array[i] = array[i];
//        }

        System.out.println(Arrays.toString(array));
    }
}
