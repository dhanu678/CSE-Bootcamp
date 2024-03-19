import java.util.Arrays;

class RevereArray {
    public static void main(String[] args) {
        int[] arr = { 10, 20, 30, 40, 50, 60 };
        // arr = reverse(arr);
        // System.out.println(Arrays.toString(arr));
        // System.out.println(Arrays.toString(newArray));
        // reverse2(arr);
        reverse3(arr);
        System.out.println(Arrays.toString(arr));
    }

    static int[] reverse(int[] arr) {
        // first way to reverse the array
        int[] reverse = new int[arr.length];

        for (int i = arr.length - 1; i >= 0; i--) {
            reverse[arr.length - 1 - i] = arr[i];
        }
        return reverse;
    }

    static void reverse2(int[] arr) {
        // second way of reversing an array
        int first = 0;
        int last = arr.length - 1;

        while (first < last) {

            int temp = arr[first];
            arr[first] = arr[last];
            arr[last] = temp;
            first++;
            last--;
        }
    }

    static void reverse3(int[] arr) {
        for (int i = 0; i < arr.length / 2; i++) {
            int temp = arr[i];
            arr[i] = arr[arr.length - 1 - i];
            arr[arr.length - 1 - i] = temp;
        }
    }
}
