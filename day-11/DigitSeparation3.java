class DigitSeparation3 {
    public static void main(String[] args) {
        int num = 654321;

        while (num != 0) {
            System.out.println("Last digit -> " + num % 10);
            num = num / 10;
            System.out.println("my updated number -> " + num);
        }
    }
}
