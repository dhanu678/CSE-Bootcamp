import java.util.Scanner;

class Question3 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a number : ");
        int user = input.nextInt();
        int a = 86;
        // if(user > a) {
        //     System.out.println("User number is greater");
        // } else {
        //     System.out.println("User number is smaller");
        // }
        System.out.println((user > a) ? "user number is greater than a" : "User number is smaller than a");
    }
}
