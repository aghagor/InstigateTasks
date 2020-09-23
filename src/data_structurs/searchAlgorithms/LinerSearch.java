package data_structurs.searchAlgorithms;

public class LinerSearch {

    public int linerSearch(int[] arr, int x) {
        if (arr.length > 0) {
            for (int i = 0; i < arr.length; i++) {
                if (x == arr[i]) {
                    return i;
                }
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        LinerSearch ls = new LinerSearch();
        int[] arr = {1, 7, 23, 5, 6, 11};
        int x = 75;
        if (ls.linerSearch(arr, x) == -1) {
            System.out.println("There isn't " + x + " in any index");
        } else System.out.println("Searching number " + x + ", is under " + ls.linerSearch(arr, x) + " index");
    }
}
