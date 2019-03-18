import java.util.Arrays;

public class Fibonacci {
    public static void main(String[] args) {
        int num = 10;
        int[] array = new int[num];
        for (int i = 0; i < num; i++) {
            if (i == 0 || i == 1) {
                array[i] = 1;
            } else
                array[i] = array[i - 1] + array[i - 2];
        }

        System.out.println(Arrays.toString(array));
    }
}
