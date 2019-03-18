public class RemoveAllWhitSpaces {
    public static void main(String[] args) {
        String str = "Hello    hkhjk  jkkj jklj     ";
        System.out.println(str);
        String nString = str.replace(" ","");
        System.out.println(nString);
    }
}
