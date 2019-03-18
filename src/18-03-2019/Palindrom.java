public class Palindrom {
    public static void main(String[] args) {
        String str = "Bob".toLowerCase();
        StringBuilder sb = new StringBuilder();
        for (int i = str.length()-1; i >=0 ; i--) {
            sb.append(str.charAt(i));
        }
        System.out.println(str.equals(sb.toString()));
    }
}
