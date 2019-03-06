public class TranspoceMatrix {
    static final int row = 3;
    static final int column = 4;

    static void transpose(int[][] givenMatrix, int[][] transposedMatrix) {
        int i, j;
        for (i = 0; i < column; i++)
            for (j = 0; j < row; j++)
                transposedMatrix[i][j] = givenMatrix[j][i];
    }
    public void printMatrix(int [][] array, int column, int row){
        for (int i = 0; i < column; i++) {
            for (int j = 0; j < row; j++)
                System.out.print(array[i][j] + " ");
            System.out.println();
        }
    }
    public static void main(String[] args) {
        TranspoceMatrix transpoceMatrix = new TranspoceMatrix();
        int[][] givenMatrix = {
                {1, 2, 3, 4},
                {5, 6, 7, 8},
                {9, 10, 11, 12}};
        int[][] transposedMatrix = new int[column][row];
        System.out.print("Given matrix is \n");
        transpoceMatrix.printMatrix(givenMatrix,row,column);
        transpose(givenMatrix, transposedMatrix);
        System.out.print("Transposed matrix is \n");
        transpoceMatrix.printMatrix(transposedMatrix,column,row);
    }
}
