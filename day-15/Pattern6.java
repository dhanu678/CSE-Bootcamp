class Pattern6 {
    public static void main(String[] args) {
        // A 
        // B C 
        // D E F 
        // G H I J 
        // K L M N O

        // System.out.println('A');
        // System.out.println('B');
        // System.out.println((char)('A' + count));
        int n = 5;
        int count = 0;
        for (int row = 0; row < n; row++) {
            for(int col = 0 ; col <= row  ; col++){
                System.out.print((char)('A' + count) + " ");  
                count++;           
            }
            System.out.println();
        }
    }
}
