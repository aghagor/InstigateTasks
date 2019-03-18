public class BiggestAndSmallest {
    private static int smallestInt;
    private static int biggestInt;

    private static int getBiggestInt(int [] array){
        for (int i = 0; i < array.length; i++) {
            if (array[i]>biggestInt){
                biggestInt=array[i];
            }
        }
        return biggestInt;
    }
    private static int getSmallestInt(int[] array){
        for (int i = 0; i < array.length; i++) {
            for (int j = i+1; j < array.length; j++) {
                if (array[i]>array[j]){
                    int temp = array[i];
                    array[i]=array[j];
                    array[j]=temp;
                }
            }
        }
        return array[0];
    }

    public static void main(String[] args) {
        int[] array = {10, 7, 8, 9, 1, 5, 6, 17, 12, 22, 3, 4, 86, 34, 31, 28, 73, 61,-7};
        System.out.println(getBiggestInt(array));
        System.out.println(getSmallestInt(array));
    }
}
