import java.util.Arrays;

public class Fibonachi {
    static int number = 10;
    static int[] fibonachiAarray= new int[number];

    public static void main(String[] args) {
        for (int i = 0; i < number; i++) {
            if (i == 0 || i == 1) {
                fibonachiAarray[i] = 1;
            } else fibonachiAarray[i] = fibonachiAarray[i - 1] + fibonachiAarray[i - 2];
        }

        System.out.println(Arrays.toString(fibonachiAarray));
    }
}
