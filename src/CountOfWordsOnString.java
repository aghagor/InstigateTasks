public class CountOfWordsOnString {
    private static String string= "Hello world he jkj njkhjh lkkjk";

    private static int getCountOfWords(String str){
        String [] array = str.split(" ");
        return array.length;
    }

    public static void main(String[] args) {
        System.out.println(getCountOfWords(string));
    }
}
