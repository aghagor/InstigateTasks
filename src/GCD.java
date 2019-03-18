import sun.misc.GC;

import java.util.Arrays;

public class GCD {
    public int findGCD(int number1, int number2) {
        if (number2 == 0) {
            return number1;
        }
        return findGCD(number2, number1 % number2);
    }

    public static void main(String[] args) {
        GCD gcd = new GCD();
        int number1 = 54;
        int number2 = 24;
        System.out.println(gcd.findGCD(number1, number2));
    }
}
