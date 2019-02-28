class Example36 {
    private static int[][] array = {
            {1, 2, 3},
            {4, 5, 6},
            {7, 8, 9}
    };
    private static int[][] changedArray = new int[3][3];
    private static void printArrayValue(int[][] array, int amount) {
        for (int i = 0; i < amount; ++i) {
            for (int j = 0; j < amount; ++j) {
                System.out.print(array[i][j] + " ");
            }
            System.out.println();
        }
    }
    private static void changeArrayRowWithColoumn(int[][] changedArray) {
        for (int i = 0; i < 3; ++i) {
            for (int j = 0; j < 3; ++j) {
                changedArray[j][i] = array[i][j];
            }
        }
    }
    public static void main(String args[]) {
        printArrayValue(array,3);
        changeArrayRowWithColoumn(changedArray);
        System.out.println("*****************");
        printArrayValue(changedArray,3);
    }
}

