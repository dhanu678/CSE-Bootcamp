class Pattern{
    public static void main(String[] args){
        // 0 1 2 3 4 5 
        // * * * * * *  --> 0
        // * * * * * *  --> 1
        // * * * * * *  --> 2
        // * * * * * *  --> 3
        // * * * * * *  --> 4
        // * * * * * *  --> 5

        // same number of rows and same number of column 
        // 
     
        int n = 5;
        for(int i = 0 ; i < n ; i++) {   // outer loop is for no. of rows
                                         // no chedchad with outer loop
            for(int j = 0 ; j < n ; j++) { // inner loop is for no. of columns/ how many stars will my row contains
                System.out.print("* ");  // always remember printing is done inside inner loop
            }
            System.out.println();
        }
        
       
    }
}