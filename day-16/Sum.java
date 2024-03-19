import java.util.Scanner;

class Sum {
    public static void main(String[] args) {
        // DRY - DON'T REPEAT YOURSELF
       sum();
       sum();
       sum();
       sum();
       sum();

    }

    static void sum(){
        Scanner input = new Scanner(System.in);
        int a, b, sum;
        System.out.println("Enter value of a: ");
        a = input.nextInt();
        System.out.println("Enter value of b: ");
        b = input.nextInt();
        sum = a+b;
        System.out.println("Value of sum is: "+sum);
    }
}
