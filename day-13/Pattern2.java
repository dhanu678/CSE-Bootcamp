class Pattern2{
    public static void main(String[] args){
        // 0 1 2 3 4 5 
        // * * * * * *  6 - 0 -> 6
        // * * * * *    6 - 1 -> 5
        // * * * *      6 - 2 -> 4
        // * * *        6 - 3 -> 3
        // * *          6 - 4 -> 2
        // *            6 - 5 -> 1
        int n = 10;
        for(int i = 0 ; i < n ; i++){

            for(int j = 0 ; j < n - i; j++){

                System.out.print("* ");

            }

            System.out.println();
        }
    }
}