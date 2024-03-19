import java.util.Arrays;
import java.util.Scanner;

class UserInputArray {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter the size for the array: ");
        int size = input.nextInt();
        int[] arr = new int[size];
        int[] arr1 = { 1, 2, 3, 4, 5, 6, 7 };
        System.out.println("Enter values for the array: ");
        // arr[0] = input.nextInt();
        // arr[1] = input.nextInt();
        // arr[2] = input.nextInt();
        // arr[3] = input.nextInt();
        // arr[4] = input.nextInt();

        for (int i = 0; i < arr.length; i++) {
            arr[i] = input.nextInt();
        }
        System.out.println(Arrays.toString(arr));
    }
}
