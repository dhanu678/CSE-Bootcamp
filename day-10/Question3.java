public class Question3 {
    public static void main(String[] args) {
        // prime number
        // 2, 3, 5, 7, 11, 13, 17, 19, 23, 29....
        int n = 11;
        // 23 % 1
        // 23 % 2
        // 23 % 3
        // 23 % 4
        // .
        // .
        // 23 % 23
        int count = 0;
        for (int i = 1; i <= n; i++) {
            if (n % i == 0) {
                count++;
            }
        }

        System.out.println(count == 2 ? "It is a prime number" : "It is not a prime number");
    }
}
