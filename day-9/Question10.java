import java.util.Scanner;

class Question10 {
    public static void main(String[] args) {
        // year 400 -> leap year;
        // year 4 -> leap year
        // year 100 then it should also be diisible by 400 - then it is a leap year

        // 1600 / 400 = 0 leap year
        // 1604 / 400 = 4 leap year
        // 1640 / 4 = leap year
        // 1900 / 400 = 300 - not leap year
        // 1900 / 4 = 0 - leap year
        // 1900 / 100 = 0 - not a leap year

        // -------------------------------------------------------------------------------
        // 1940 % 400 = 340 -> not a leap year
        // 1940 % 4 = 0 -> leap year
        // 1940 % 100 = 40 -> leap year

     //   System.out.println(1940 % 100);
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a number : ");
        int year = input.nextInt();
        if (year % 400 == 0) {
            System.out.println("It is a leap year");
        } else {
            if (year % 4 == 0) {
                if (year % 100 != 0) {
                    System.out.println("It is a leap year");
                } else {
                    System.out.println("It is not a leap year");
                }
            } else {
                System.out.println("It is not a leap year");
            }
        }
    }
}
