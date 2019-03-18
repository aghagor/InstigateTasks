public class LeapYear {

    private static boolean isLeapYear(int year) {
        return ((year & 3) == 0) && ((year % 100) != 0 || (year % 400) == 0);
    }

    public static void main(String[] args) {
        System.out.println(isLeapYear(2020));
    }
}
