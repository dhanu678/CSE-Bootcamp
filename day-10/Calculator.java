import java.util.Scanner;

class Calculator {
    public static void main(String[] args) {
        // +, -, *, /
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the operator : ");
        char ch = input.next().charAt(0);

        System.out.println("Enter value of a : ");
        int a = input.nextInt();
        System.out.println("Enter value of b : ");
        int b = input.nextInt();

        switch (ch) {
            case '+':
                System.out.println(a + b);
                break;

            case '-':
                System.out.println(a - b);
                break;

            case '*':
                System.out.println(a * b);
                break;

            case '/':
                System.out.println(a / b);
                break;

            default:
                System.out.println("Incorrect operator");
        }
    }
}
