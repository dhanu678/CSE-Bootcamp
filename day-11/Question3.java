class Question3 {
    public static void main(String[] args) {
        // count digits
        // int num = 123456789; // ans = 6
        // int count = 0;
        // while (num != 0) {
        // num = num / 10;
        // count++;
        // }
        // System.out.println(count);

        // sum of digits
        int num = 1234567; // 1*2*3*4 = 24
        // 4532 - 4+5+3+2 -> 14
        int sum = 0;
        while (num != 0) {
            int digit = num % 10;
            num = num / 10;
            sum = sum*10 + digit;
        }
        System.out.println(sum);
    }
}
