class Pattern4{
    public static void main(String[] args){
        // 0 1 2 3 4 5 
        // * * * * * *  --> 0
        // *         *  --> 1
        // *         *  --> 2
        // *         *  --> 3
        // *         *  --> 4
        // * * * * * *  --> 5
        int n = 5;
        // 'i' is nothing but our row number
        // 'j' is nothing but our column number

         for(int i = 0 ; i < n ; i++) {   // outer loop is for no. of rows
                                         // no chedchad with outer loop
            for(int j = 0 ; j < n ; j++) { // inner loop is for no. of columns/ how many stars will my row contains
               
                if(i == 0 || i == n - 1 || j == 0 || j == n - 1){
            
                    System.out.print("* ");  // always remember printing is done inside inner loop

                } else {
                    System.out.print("  ");
                }
            }
            System.out.println();
        }
    }
}