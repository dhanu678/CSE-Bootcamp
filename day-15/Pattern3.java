class Pattern3 {
    public static void main(String[] args) {
    //      *
    //     * *
    //    *   *
    //   *     *
    //  *********
    int n = 8;
        for(int i = 0 ; i < n ; i++){
            for (int j = 0; j < n - i - 1; j++) {
                System.out.print(" ");
            }

            for(int j = 0 ; j <= i * 2 ; j++){
               if (j == 0 || i == n-1 || j == i*2) {
                    System.out.print("*");
               }
                else{
                    System.out.print(" ");
                }
                
            }
            System.out.println();
        }
    }
}
