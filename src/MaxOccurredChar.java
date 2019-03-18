public class MaxOccurredChar {
    static final int N = 256;
    static char MaxOccuringChar(String string) {
        int ctr[] = new int[N];
        int l = string.length();
        for (int i = 0; i < l; i++)
            ctr[string.charAt(i)]++;
        int max = -1;
        char result = ' ';

        for (int i = 0; i < l; i++) {
            if (max < ctr[string.charAt(i)]) {
                max = ctr[string.charAt(i)];
                result = string.charAt(i);
            }
        }

        return result;
    }
    public static void main(String[] args) {
        String string = "test strings1";
        System.out.println("The given string is: " + string);
        System.out.println("Max occurring character in the given string is: " + MaxOccuringChar(string));
    }
}
