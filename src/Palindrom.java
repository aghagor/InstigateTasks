public class Palindrom {
    public static void main(String[] args) {
        String str = "Bob";
        str = str.toUpperCase();
        String gettingText ="";
        for (int i = str.length()-1; i >= 0; i--) {
            gettingText += str.charAt(i);
        }
        System.out.println(gettingText);
        System.out.println(str.equals(gettingText));
    }
}
