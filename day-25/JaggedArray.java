class JaggedArray {
    public static void main(String[] args) {
        int[][] arr = {
                { 1, 2 },
                { 4, 5, 6, 7 },
                { 7, 8, 9 }
        };

        // if we want the size of row or count if subarray
        // arr.length
        System.out.println("no of sub array: " + arr.length);
        System.out.println("size if first subarray: " + arr[0].length);
        System.out.println("size if second subarray: " + arr[1].length);
        System.out.println("size if third subarray: " + arr[2].length);
        // printArray(arr);
    }

    static void printArray(int[][] arr) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
    }
}
