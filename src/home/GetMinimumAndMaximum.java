package home;

import java.util.Arrays;

public class GetMinimumAndMaximum {
    private static int maximum = 0;
    private static int minimum = 0;
    public int getMaximum(int []array){
        for (int i = 0; i < array.length; i++) {
            if (array[i]>maximum)
                maximum=array[i];
        }
        return maximum;
    }

    public int getMinumum(int [] array){
        for (int i = 0; i < array.length; i++) {
            for (int j = i+1; j <array.length ; j++) {
                if (array[i]>array[j]){
                    int temp = array[i];
                    array[i]=array[j];
                    array[j]= temp;
                }
            }
        }
        minimum = array[0];
        return minimum;
    }

    public static void main(String[] args) {
        GetMinimumAndMaximum minimumAndMaximum = new GetMinimumAndMaximum();
        int[] givvenArray = {5, 8, 4, 6, 7, 2, 3, 1, 14, 11, 65, 24, 23, 19, 15};
        System.out.println(Arrays.toString(givvenArray));
        System.out.println(minimumAndMaximum.getMaximum(givvenArray));
        System.out.println(minimumAndMaximum.getMinumum(givvenArray));
    }
}
