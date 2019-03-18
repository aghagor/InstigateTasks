
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Sort sort = new Sort();
        int[] array = {10, 7, 8, 9, 1, 5, 6, 17, 12, 22, 3, 4, 86, 34, 31, 28, 73, 61, 102};
        System.out.println(Arrays.toString(array));
        sort.quickSort(array, 0, array.length - 1);
        System.out.println(Arrays.toString(array));

    }
}
