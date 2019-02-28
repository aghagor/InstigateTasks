public class Example23 {
    public static void main(String[] args) {
        int sum =1;
        int counter = 0;
        int number = 0;
        while (counter < 100) {
            number++;
            if (number % 2 != 0) {
                if (isPrimeNumber(number)) {
                    sum += number;
                    counter++;
                }
            }
        }
        System.out.println("Sum of the first 100 prime numbers: " + sum);
    }
    private static boolean isPrimeNumber(int n) {
        for (int i = 3; i * i <= n; i += 2) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }
}
