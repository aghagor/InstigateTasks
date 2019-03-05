import java.time.Year;

public class LeapYear {
    public static void main(String[] args) {
        System.out.println(
                leapYear(2754));
    }

    private static boolean leapYear(int year){
        return ((year & 3) == 0) && ((year % 100) != 0 || (year % 400) == 0);
    }
}
