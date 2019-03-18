package home;

public class SumOfDigits {
    public int getSum(int number) {
        int sumOfNumber = 0;
        String string = String.valueOf(number);
        char[] chars = string.toCharArray();
        for (int i = 0; i < chars.length; i++) {
            int num = Integer.parseInt(String.valueOf(chars[i]));
            sumOfNumber += num;
        }
        return sumOfNumber;
    }

    public int getSumRecursion(int number) {
        return number == 0 ? 0 : number % 10 +
                getSumRecursion(number / 10);
    }

    public int getSumRecursionIfElse(int number) {
        int sumOfNumber = 0;
        if (number == 0) return sumOfNumber;
        else sumOfNumber = number % 10 + getSumRecursionIfElse(number / 10);
        return sumOfNumber;
    }

    public static void main(String[] args) {
        SumOfDigits an = new SumOfDigits();
        System.out.println(an.getSumRecursionIfElse(2147483647));
    }
}
