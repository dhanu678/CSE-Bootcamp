class SwappingNumbers {
    public static void main(String[] args) {
     
        int a = 10;
        int b = 20;
        System.out.println("before swapping: a = " + a + ", b = " + b);
        //swap(a, b);
        a = a * b; //  a = 111 + 222 = 333  = 200
        b = a / b; //  b = 333 - 222 = 111 = 10
        a = a / b; //  a = 333 - 111 = 222 = 20
        System.out.println("after swapping: a = " + a + ", b = " + b);
    }

   
    // static void swap(int a, int b){
    //     int temp = a;
    //     a = b;
    //     b = temp;
    // }
}
