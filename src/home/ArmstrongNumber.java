package home;

import java.util.Scanner;

public class ArmstrongNumber {
    public static int isArmstrong(int num) {
        return num == 0 ? 0 : (int) (Math.pow(num % 10, 3) + isArmstrong(num / 10));
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter an integer");
        int nextInt = Integer.parseInt(scanner.nextLine());
        System.out.println(nextInt == isArmstrong(nextInt));
    }
}
