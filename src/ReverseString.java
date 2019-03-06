public class ReverseString {
    public static void main(String[] args) {
        String simple = "Hello World 123456 sdcfdfcsd sdf gag";
        String[] array = simple.split(" ");
        String newString = "";
        for (int i = array.length - 1; i >= 0; i--) {
            newString += (array[i] + " ");
        }
        System.out.println(newString);
    }
}
