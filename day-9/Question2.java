import java.util.Scanner;

class Question2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        // encryption -
        // HI -> encryption -> ksjdbvklsdb
        // ksjdbvklsdb -> decrypted -> HI
        // A -> 65
        // B -> 66
        // C -> 67
        System.out.println("Enter any character to encrypt -> ");
        char grade = input.next().charAt(0);
        
        System.out.println("before encryption -> " + grade);
        char encrypt = (char) (grade + 5);
        System.out.println("after encryption -> " + encrypt);

        char decrypt = (char) (encrypt - 5);
        System.out.println("after decryption -> " + decrypt);

    }
}
