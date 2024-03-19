import java.util.Scanner;
class Question8 {
    public static void main(String[] args) {
        // <2.5 = 0
        // 2.5 - 5 = 5%
        // 5 - 10 = 20%
        // > 10 = 30%

        Scanner input = new Scanner(System.in);
        int income = input.nextInt();
        int taxRate = 0;

        if (income >= 250000 && income < 500000) {
            taxRate = 5;
        }
        else if (income >= 500000 && income < 1000000) {
            taxRate = 20;
        }
        else if (income >= 1000000) {
            taxRate = 30;
        }

        int tax = income / 100 * taxRate;
        System.out.println("The income tax is -> " + tax + "\nAnd your tax rate is : " + taxRate);
      //  System.out.println();
    }
}
