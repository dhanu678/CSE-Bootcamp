class FindNegativeElements {
    public static void main(String[] args) {
        int[] atharva = {10, -20, 30, -40, 50, -3, -2};

       printNegative(atharva);
    }

    static void printNegative(int[] arr){
      
        for (int i = 0; i < arr.length; i++) {
            if(arr[i] < 0){
                System.out.print(arr[i] + " ");
            }
        }

        System.out.println();
    }

}
