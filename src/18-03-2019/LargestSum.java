import java.util.Arrays;

public class LargestSum {

    static int maxSubArraySum(int[] array) {
        int largestSum = 0;
        int currentMax = 0;
        int[] arrayE = new int[array.length];
        for (int i = 0; i < array.length; i++) {
            currentMax = currentMax + array[i];
            if (currentMax < 0)
                currentMax = 0;
            else if (largestSum < currentMax)
                largestSum = currentMax;
            if (currentMax > 0) {
                arrayE[i] = array[i];
            }
        }
        System.out.println(Arrays.toString(arrayE).replace("0,", ""));
        return largestSum;
    }

    public static void main(String[] args) {
        int[] givvenArray = {1, 4, -1, 2, 1, -5, 4};
        System.out.println(Arrays.toString(givvenArray));
        System.out.println(maxSubArraySum(givvenArray));
    }
}
