import java.util.Scanner;

class Method2 {
    public static void main(String[] args) {
        int a = 20;
        int b = 30;
       // int c = 40;
        sum(a, b);
    }

    // parameters

    static void sum(int a, int b){ // creating a function/method
     //   Scanner input = new Scanner(System.in);
     //   int a, b, sum;

     //   System.out.println("Enter value of a: ");
     //   a = input.nextInt();
        System.out.println("Enter value of b: ");
     //   b = input.nextInt();
        int sum = a+b;
        System.out.println("The sum is : " + sum);

    }
}
