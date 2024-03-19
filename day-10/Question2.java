public class Question2 {
    public static void main(String[] args) {
        // 10
        // 0 2 4 6 8 10 -> 30
        int num = 12;
        int sum = 0;
        // for (int i = 0; i <= num; i++) {
        //     if (i % 2 == 0) {
        //         sum = sum + i;
        //     }
        // }

        for(int i = 1 ; i <= num ; i+= 2){
            sum += i;
        }
        System.out.println(sum);
    }
}
