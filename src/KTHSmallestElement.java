import java.util.Arrays;

public class KTHSmallestElement {
    public static void main(String[] args) {
        int arr[] = {10, 7, 8, 9, 1, 5, 6, 17, 12, 22, 3, 4, 86, 34, 31, 28, 73, 61, 102};
        int k = 5;
        System.out.println("K'th smallest element is " +
                kthSmallest(arr, k));
        System.out.println(Arrays.toString(arr));
    }

    private static int kthSmallest(int[] arr, int num) {
        sort(arr);
        return arr[num - 1];
    }

    private static int[] sort(int [] arr){
        for (int k = 0; k < arr.length - 1; k++) {
            for (int l = 0; l < arr.length-k-1; l++) {
                if (arr[l] > arr[l+1]) {
                    int temp = arr[l];
                    arr[l]=arr[l+1];
                    arr[l+1] = temp;
                }
            }
        }
        return arr;
    }
}
