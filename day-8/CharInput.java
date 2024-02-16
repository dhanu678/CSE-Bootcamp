import java.util.Scanner;

class CharInput {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // char ch = 'a';
        char ch1 = input.next().charAt(0);

        System.out.println(ch1);
    }
}
