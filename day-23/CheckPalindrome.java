import java.util.Arrays;

class CheckPalindrome {
    public static void main(String[] args) {
        int[] arr = { 10, 20, 30, 30, 20, 10 };
        System.out.println(isPalindrome1(arr));
    }

    static int[] reverse(int[] arr) {
        int[] reverse = new int[arr.length];

        for (int i = arr.length - 1; i >= 0; i--) {
            reverse[arr.length - 1 - i] = arr[i];
        }
        return reverse;
    }

    static boolean isPalindrome(int[] arr) {
        int[] rev = reverse(arr);
        for (int i = 0; i < rev.length; i++) {
            if (arr[i] != rev[i]) {
                return false;
            }
        }
        return true;
    }

    static boolean isPalindrome1(int[] arr) {
        int first = 0;
        int last = arr.length - 1;
        while (first < last) {
            if (arr[first] != arr[last]) {
                return false;
            } else {
                first++;
                last--;
            }
        }
        return true;
    }

}
