public class MatrixMultiplication {
    private static int[][] multiplicate(int[][] first, int[][] second) {
        int[][] result = new int[4][4];
        for (int i = 0; i < first.length; i++) {
            for (int j = 0; j < second.length; j++) {
                result[i][j] = 0;
                for (int k = 0; k < result.length; k++) {
                    result[i][j] += first[i][k] * second[k][j];
                }
            }
        }
        return result;
    }

    public static void main(String[] args) {
        int[][] first = {
                {1, 1, 1, 1},
                {2, 2, 2, 2},
                {3, 3, 3, 3},
                {4, 4, 4, 4}
        };
        int[][] second = {
                {1, 1, 1, 1},
                {2, 2, 2, 2},
                {3, 3, 3, 3},
                {4, 4, 4, 4}
        };
        int[][] multiResult = multiplicate(first, second);
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                System.out.print(multiResult[i][j] + " ");
            }
            System.out.println();
        }
    }
}
