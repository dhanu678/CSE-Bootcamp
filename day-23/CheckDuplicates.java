class CheckDuplicates {
    public static void main(String[] args) {
        int[] arr = { 10, 30, 100, 20, 500, 50 };
        System.out.println(checkDuplicates(arr));
    }

    static boolean checkDuplicates(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            int currentElement = arr[i];
            boolean isDuplicate =  linearSearch(arr, i + 1, currentElement);
            if (isDuplicate) {
                return true;
            }
        }
        return false;
    }

    static boolean linearSearch(int[] arr, int index, int search) {
        for (int i = index; i < arr.length; i++) {
            if (arr[i] == search) {
                return true;
            }
        }
        return false;
    }
}
