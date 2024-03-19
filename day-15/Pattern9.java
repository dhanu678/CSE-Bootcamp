class Pattern9 {
    public static void main(String[] args) {
        // G F E D C B A 1 2 3 4 5 6 7
        // G F E D C B     2 3 4 5 6 7
        // G F E D C         3 4 5 6 7
        // G F E D             4 5 6 7
        // G F E                 5 6 7
        // G F                     6 7
        // G                         7

        // 7 6 5 4 3 2 1
        // 7 6 5 4 3 2
        // 7 6 5 4 3
        // 7 6 5 4
        // 7 6 5
        // 7 6
        // 7
        for (int i = 0; i < 7; i++) {
            for (int j = 0; j < 7 - i; j++) {
                System.out.print((char)('A' + 7 - j - 1) + " ");
            }
            System.out.println();
        }
    }
}
