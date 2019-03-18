import java.util.Arrays;

public class MultipleArrays {
    static int[] firstArray = {1, 12, 75, 6};
    static int[] secondArray = {5, 4, 0, -8};
    static int[] multipliedArray = new int[4];

    private static void multipliedArraysElements() {
        int result = 0;
        for (int i = 0; i < firstArray.length; i++) {
            int num1 = firstArray[i];
            int num2 = secondArray[i];
            result = num1 * num2;
            multipliedArray[i] = result;
        }
    }

    public static void main(String[] args) {
        System.out.println("First Array ->      " + Arrays.toString(firstArray));
        System.out.println("Seccond Array ->    " + Arrays.toString(secondArray));
        multipliedArraysElements();
        System.out.println("Multiplied Array -> " + Arrays.toString(multipliedArray));
    }
}
