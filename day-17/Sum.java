import java.util.Scanner;

class Sum {
    public static void main(String[] args) {

      sum(); // calling a function/method
      sum();
      sum();

    }

    static void sum(){ // creating a function/method
        Scanner input = new Scanner(System.in);
        int a, b, sum;

        System.out.println("Enter value of a: ");
        a = input.nextInt();
        System.out.println("Enter value of b: ");
        b = input.nextInt();
        sum = a+b;
        System.out.println("The sum is : " + sum);

    }

    // return_type name(){

    // }
}
