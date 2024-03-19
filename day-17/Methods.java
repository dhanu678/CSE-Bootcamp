class Methods {
    public static void main(String[] args) {
        int a = 20;
        a = 100;
        // if(a == 20){
        //     int b = 30;
        //     System.out.println("A is 20");
        //     System.out.println(b);
        // }
      //  System.out.println(b);

    //   int i;
    //   for (i = 0; i < 5; i++) {
    //     System.out.println(i);
    //   }

    //   System.out.println("outside loop ->" + i);
        for (int i = 0; i < 5; i++) {
            for(int j = 0 ; j < 5 ; j++){
                System.out.println("Inside first inner loop");
                System.out.println("i= " + i + ", j= " + j);
            }
          //  System.out.println(j);
            for(int j = 0 ; j < 5 ; j++){
                System.out.println("Inside second inner loop");
                System.out.println("i= " + i + ", j= " + j);
            }
        }
    }
}
