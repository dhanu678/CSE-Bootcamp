class ArrayDemo3 {
    public static void main(String[] args) {
      //  int[] arr = new int[5];

        // int[] arr = {10, 'c', 30, -40, 50, -60, 70, -80, 90};

        // System.out.println("This is the size of the array -> " +arr.length);
        // int size = arr.length;
        // for(int i = 0 ; i < size ; i++){
        //     System.out.print(arr[i] + " ");
        // }
        // System.out.println();


        String[] name = new String[5];

        name[0] = "atharva";
        name[1] = "dhanashree";
        name[2] = "sakshi";
        name[3] = "soham";
        name[4] = "shreya";

        for(int i = 0 ; i < name.length ; i++){
            System.out.print(name[i] + " ");
        }

        // enhanced for loop
        System.out.println();
    }
}
