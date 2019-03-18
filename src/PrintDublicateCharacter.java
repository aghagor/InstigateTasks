public class PrintDublicateCharacter {
    public static void main(String[] args) {
        String str = "assabhello b";
        int count = 0;
        for (int i = 0; i < str.length() - 1; i++) {
            for (int j = i + 1; j < str.length(); j++) {
                if (str.charAt(i) == str.charAt(j)) {
                    System.out.println(str.charAt(j));
                    count++;
                    break;
                }
            }
        }
    }
}
