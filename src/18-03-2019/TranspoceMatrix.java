public class TranspoceMatrix {
   private static int col = 3;
   private static int row = 3;
    public static void main(String[] args) {
        int[][] matrix = {
                {1, 2, 3},
                {4, 5, 6},
                {7, 8, 9}
        };
        int[][] trancspoce = new int[3][3];
        transpoce(matrix,trancspoce);
        printMatrix(matrix, 3, 3);
        printMatrix(trancspoce, 3, 3);
    }

    private static void transpoce(int [][]givenMatrix, int[][]transpocedMatrix){
        for (int i = 0; i < col; i++) {
            for (int j = 0; j < row; j++) {
                transpocedMatrix[i][j]= givenMatrix[j][i];
            }
        }
    }

    private static void printMatrix(int[][] matrix, int col, int row) {
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
    }
}
