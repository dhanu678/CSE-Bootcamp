class AdditionOfMatrix {
    public static void main(String[] args) {
        int[][] matrixOne = {
                { 1, 2, 3 },
                { 4, 5, 6 },
                { 7, 8, 9 }
        };

        int[][] matrixTwo = {
                { 10, 20, 30 },
                { 40, 50, 60 },
                { 70, 80, 90 }
        };

        // printArray(matrixOne);
        // printArray(matrixTwo);
        matrixSum(matrixOne, matrixTwo);
    }

    static void matrixSum(int[][] m1, int[][] m2){
        if(m1.length != m2.length) {
            System.out.println("Cannot add these matrix");
            return;
        }

        int[][] ans = new int[m1.length][m2.length];
        for(int i = 0 ; i < m1.length ; i++){
            for(int j = 0 ; j < m2.length ; j++){
                ans[i][j] = m1[i][j] + m2[i][j];
            }
        }

        printArray(ans);

    }


    static void printArray(int[][] arr) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
    }
}
