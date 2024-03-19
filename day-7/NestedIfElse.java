class NestedIfElse {

    // divides by two or not
    // divided by 3 also
    public static void main(String[] args) {
        int num = 15;
        if (num % 2 == 0) {
            if (num % 3 == 0) {
                System.out.println("num is divisible by 3 and 2");
            } else {
                System.out.println("number is only divisible by 2");
            }
        } else {
            System.out.println("number is bot divisible by 2");
        }
    }
}
