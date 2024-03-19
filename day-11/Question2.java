class Question2 {
    public static void main(String[] args) {
        int a = 3;
        int b = 4;
        // 3^4
        // a^b
        int ans = 1;
        // 3 * 3 * 3 * 3
        for(int i = 0;  i < b ; i++){
            ans = ans * a;
        }
        System.out.println(ans);
    }
}
