class Pattern5{
    public static void main(String[] args){
        // 0 1 2 3 4 5 6 
        // *              0 + 1
        // * *            1 + 1
        // *   *          2 + 1
        // *     *        3 + 1
        // *       *      4 + 1
        // *         *    5 + 1
        // * * * * * * *  6 + 1

        int n = 7;
        for(int i = 0 ; i < n ; i++){  //i = 5
            
            for(int j = 0 ; j < i + 1 ; j++){

                if(i == n -1 || j == 0 || i == j){
                     System.out.print("* ");

                }
                else {
                    System.out.print("  ");
                }

            }

            System.out.println();
        }
    }
}