import java.util.Arrays;

class ArrayProgram {
    public static void main(String[] args) {
                   // 0    1   2   3   4   5   6
        int[] arr = { 10, 20, 30, 45, 67, 43, 21 };
        int target = 97;

        int[] ans = targetSum(arr, 110);
        System.out.println(Arrays.toString(ans));
    }

    static int[] targetSum(int[] arr, int target) {
        int[] ans = new int[2];
        // boolean isPresent = false;
        // to catch each element one by one
        for (int i = 0; i < arr.length; i++) {
            int currentElement = arr[i];
            for (int j = i + 1; j < arr.length; j++) {
                int nextElement = arr[j];
                int sum = currentElement + nextElement;
                if (sum == target) {
                    // isPresent = true;
                    ans[0] = i;
                    ans[1] = j;
                    // System.out.println(i);
                    // System.out.println(j);
                }
            }
        }
        return ans;
    }
}
