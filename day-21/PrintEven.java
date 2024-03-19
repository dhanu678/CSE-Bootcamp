class PrintEven {
    public static void main(String[] args) {
        int shreya[] = { 23, 45, 34, 67, 68, 54 };
        printEven(shreya);
    }

    static void printEven(int[] array) {
  
        for (int i = 0; i < array.length; i++) {
            if (array[i] % 2 == 0) {
                System.out.print(array[i] + " ");
            }
        }
        System.out.println();
    }

}
