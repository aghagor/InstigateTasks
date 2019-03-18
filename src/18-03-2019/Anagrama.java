import java.util.ArrayList;
import java.util.Arrays;

public class Anagrama {


    public static void main(String[] args) {
        String first = "army".toLowerCase();
        String second = "Mary".toLowerCase();
        System.out.println(isStringsAnagrama(first,second));
    }

    private static boolean isStringsAnagrama(String first, String second){
        boolean isTheSame = false;
        char[] firstArray = first.toCharArray();
        char[] secondArray = second.toCharArray();
        Arrays.sort(firstArray);
        Arrays.sort(secondArray);
        StringBuilder sb1 = new StringBuilder();
        StringBuilder sb2 = new StringBuilder();
        if (firstArray.length != secondArray.length) {
            return isTheSame;
        } else {
            for (int i = 0; i < firstArray.length; i++) {
                sb1.append(firstArray[i]);
                sb2.append(secondArray[i]);
            }
            if (sb1.toString().equals(sb2.toString())) {
                isTheSame = true;
            } else return isTheSame;
        }
        return isTheSame;
    }
}
