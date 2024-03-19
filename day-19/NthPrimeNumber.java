class NthPrimeNumber {
    public static void main(String[] args) {
        // 2 3 5 7 11 13 17 19 23 29 31 37 41 -> prime number
        // 1 2 3 4  5  6  7  8  9 10 11 12 13 14

        int num = 11;
        for (int i = 1; i <= 10; i++) {
            System.out.println(i + " -> " + nTh_prime_number(i));
        }
    }

    static int nTh_prime_number(int num) {
        int count = 0;
        int i = 0; // 3
        while (num != count) { // 2 != 1
            if (isPrime(i))
                count++; // 2
            i++;
        }
        return i - 1;
    }

    static boolean isPrime(int num) {
        int count = 0;
        for (int i = 1; i <= num; i++) {
            if (num % i == 0)
                count++;
        }
        return count == 2;
    }
}
