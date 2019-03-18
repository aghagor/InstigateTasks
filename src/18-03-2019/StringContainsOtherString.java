
public class StringContainsOtherString {

    private static void isContain(String string, String searchingString) {
        boolean isPresent = string.indexOf(searchingString) != -1 ? true : false;
        if (isPresent) {
            System.out.println("input string: " + string);
            System.out.println("search string: " + searchingString);
            System.out.println("does String contains substring? " + isPresent);
        }
        else if(!isPresent){
            System.out.println("input string: " + string);
            System.out.println("search string: " + searchingString);
            System.out.println("does String contains substring? " + isPresent);
        }
    }

    public static void main(String[] args) {
        isContain("Hello is the best programming language", "Java");
    }

}
