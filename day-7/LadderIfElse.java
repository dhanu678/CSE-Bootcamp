class LadderIfElse {
    public static void main(String[] args) {
        int a = 20, b = 130, c = 40, d = 100;
        if (a > b && a > c && a > d) {
            System.out.println("a is maximum value");
        } else if (b > a && b > c && b > d) {
            System.out.println("B is the max value");
        } else if (c > a && c > b && c > d) {
            System.out.println("C is the greatest value");
        } else {
            System.out.println("D is the greatest value");
        }
    }
}
