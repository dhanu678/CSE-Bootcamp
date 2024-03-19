class Pattern1{
    public static void main(String[] args){
        // 0 1 2 3 4 5 
        // *            0 + 1
        // * *          1 + 1
        // * * *        2 + 1
        // * * * *      3 + 1
        // * * * * *    4 + 1
        // * * * * * *  5 + 1

        int n = 10;
        for(int i = 0 ; i < n ; i++){  //i = 5
            
            for(int j = 0 ; j < i + 1 ; j++){

                System.out.print("* ");

            }

            System.out.println();
        }
    }
}