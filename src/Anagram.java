
import java.util.Arrays;

public class Anagram {
    private static boolean isAnagram(String first, String second) {
        boolean isAnagrams = false;
        boolean status = false;
        char[] c1 = first.toLowerCase().toCharArray();
        char[] c2 = second.toLowerCase().toCharArray();
        if (c1.length != c2.length) {
            return isAnagrams;
        } else {
            Arrays.sort(c1);
            Arrays.sort(c2);
            status = Arrays.equals(c1, c2);
        }
        if (status) isAnagrams = true;
        else isAnagrams = false;
        return isAnagrams;
    }

    public static void main(String[] args) {
        String army = "army";
        String mary = "Mary";
        System.out.println(isAnagram(army, mary));
    }
}
