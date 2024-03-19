class Pattern1 {
    public static void main(String[] args) {

                // 0 1 2 3 4 5 
        // * * * * * *     5 + 1
        // - * * * * *     4 + 1
        // - - * * * *     3 + 1
        // - - - * * *     2 + 1
        // - - - - * *     1 + 1
        // - - - - - *     0 + 1

       

        pattern1(13);
        System.out.println();
        pattern2(6);
        System.out.println();
        pattern2(4);
        System.out.println();
        pattern1(8);

    }

    static void pattern1(int num) {
        for (int i = 0; i < num; i++) { // outer loop is for no. of rows
            // no chedchad with outer loop
            for (int j = 0; j < num; j++) { // inner loop is for no. of columns/ how many stars will my row contains
                System.out.print("* "); // always remember printing is done inside inner loop
            }
            System.out.println();
        }
    }

    static void pattern2(int num){
        for(int i = 0 ; i < num ; i++){  //i = 5          
            for(int j = 0 ; j < i + 1 ; j++){
                System.out.print("  ");
            }
            for(int j = 0 ; j < num - i; j++){
                System.out.print("* ");
            }
           System.out.println();
        }
    }
}
