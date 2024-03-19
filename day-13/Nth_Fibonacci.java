class Nth_Fibonacci{
    public static void main(String[] args){
        // 1  2  3  4  5  6  7   8   9  10  11  12   13
        // 0, 1, 1, 2, 3, 5, 8, 13, 21, 34, 55, 89, 144
        int num = 13;
        int first = 0;
        int second = 1;
        int sum = 0;
        for(int i = 1 ; i <= num - 2 ; i++){
            sum = first + second;
            first = second;
            second = sum;
        }

        System.out.println(sum);
    }
}