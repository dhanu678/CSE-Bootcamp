class IncrementDecrement {
    public static void main(String[] args) {
        // int a = 20;
        // System.out.println(a++);
        // System.out.println(a);

        int a = 10;
        int b = a++;

        System.out.println(a);
        System.out.println(b);

        // int a = 10;
        // int b = a--;
        // int c = ++b;

        // System.out.println(a); // 10 -> 9
        // System.out.println(b); // 10 -> 11
        // System.out.println(c); // 11

        // int a = 5;
        // int b = a--;
        // int c = ++a;
        // int d = --c;

        // System.out.println(a); // -> 5 -> 4 -> 5
        // System.out.println(b); // -> 5
        // System.out.println(c); // -> 5 -> 4
        // System.out.println(d); // -> 4

        // int a = 8;
        // int b = a++ + ++a;
        // 8 + 10
        // int c = a + b++;

        // int d = a++ + --c;

        // System.out.println(a);
        // System.out.println(b);
        // System.out.println(c);
        // System.out.println(d);
    }
}
