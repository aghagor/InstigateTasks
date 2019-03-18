import java.util.Arrays;

public class FirstNonRepetedChar {

    private static char firstNoneRepetedChar(String str) {
        char[] chars = str.toCharArray();
        Arrays.sort(chars);
        char c = chars[0];
        for (int i = 1; i < chars.length - 1; i++) {
            if (chars[i] != chars[i - 1] && chars[i] != chars[i + 1]) {
                return chars[i];
            }

        }
        return c;
    }

    public static void main(String[] args) {
        String str = "asdfgtdjaf";
        System.out.println(firstNoneRepetedChar(str));
    }
}
