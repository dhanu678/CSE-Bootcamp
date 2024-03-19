class Question1{
    public static void main(String[] args) {
        // 5 - 5*4*3*2*1 -> 120
        // 4 - 4*3*2*1 -> 24
        // 6 - 6*5*4*3*2*1*0 -> 720 => 0
        int n = 6;
        int ans = 1;
        for(int i = 1 ; i <= n ; i++){
            ans = ans * i;
        }

        System.out.println(ans);
    }
}