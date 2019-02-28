public class Example30 {
    public static int factorial(int n) {
        if(n == 0) return 1;
        else if(n == 1) return 1;
        else return factorial(n-1) * n;
    }
    public static void main(String[] args) {
        System.out.println(factorial(0));
    }
}
