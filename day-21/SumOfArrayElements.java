class SumOfArrayElements {
    public static void main(String[] args) {
        int[] dhanashri = { 30, 40, 50, 60 };
        // ans = 10 + 20 + 30 + 40 + 50 = 150

        //int sum = printSum(dhanashri);
        System.out.println(printSum(dhanashri));
    }

    static int printSum(int[] arr) {

        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];
        }
        return sum;
    }
}
