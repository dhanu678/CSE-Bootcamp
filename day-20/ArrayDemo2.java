class ArrayDemo2 {
    public static void main(String[] args) {
        // int[] arr = new int[5];

        // System.out.println("Hello world");
        // System.out.println("Hii there");
        // System.out.println(arr['a']);

        int a = 20;
        System.out.println(a);

        int[] arr = new int[100];
        arr[0] = 10;
        arr[1] = 20;
        arr[2] = 30;
        arr[3] = 40;
        arr[4] = 50;

        System.out.println(arr);
        // [I@7344699f  - representation of memory address
        // System.out.println(arr[0]);
        // System.out.println(arr[1]);
        // System.out.println(arr[2]);
        // System.out.println(arr[3]);
        // System.out.println(arr[4]);

        for(int i = 0 ; i < 5; i++){
            System.out.print(arr[i] + " ");
        }
    }
}
