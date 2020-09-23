package data_structurs.searchAlgorithms;

public class RecursiveSearch {

    public int recursiveSearch(int[] arr, int left, int right, int x) {

        if (right < left) {
            return -1;
        } else if (arr[left] == x) {
            return left;
        } else if (arr[right] == x) {
            return right;
        }
        return recursiveSearch(arr, left + 1, right - 1, x);
    }

    public static void main(String[] args) {
        RecursiveSearch rs = new RecursiveSearch();
        int[] arr = {1, 7, 23, 5, 6, 11};
        int left = 0;
        int right = arr.length - 1;
        int x = 5;
        int index = rs.recursiveSearch(arr, left, right, x);
        if (index != -1) {
            System.out.println("Element " + x + " is present at index " +
                    index);
        } else
            System.out.println("Element " + x + " is not present");

    }
}
