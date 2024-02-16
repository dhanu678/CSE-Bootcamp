import java.util.Scanner;

class UserForm {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter your First Name : ");
        String firstname = input.next();
        System.out.println("Enter your last name : ");
        String lastname = input.next();
        System.out.println("ENter you DOB : ");
        String dob = input.next();
        System.out.println("Enter your age : ");
        int age = input.nextInt();
        System.out.println("Enter you income: ");
        double income = input.nextDouble();
        System.out.println("Enter your contact number: ");
        long contactNumber = input.nextLong();
        System.out.println("Enter you gender F/M : ");
        char gender = input.next().charAt(0);

        System.out.println("-------------------------------------------------------------------");
        System.out.println(firstname);
        System.out.println(lastname);
        System.out.println(dob);
        System.out.println(age);
        System.out.println(income);
        System.out.println(contactNumber);
        System.out.println(gender);
    }
}
