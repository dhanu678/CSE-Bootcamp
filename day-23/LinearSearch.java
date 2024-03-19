class LinearSearch {
    public static void main(String[] args) {
        int[] arr = { 12, 34, 56, 32, 76, 89, 54 };
        System.out.println(linearSearch1(arr, 89));
    }

    static boolean linearSearch(int[] arr, int search) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == search) {
                return true;
            }
        }
        return false;
    }

    static int linearSearch1(int[] arr, int search) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == search) {
                return i;
            }
        }
        return -1;
    }
}
