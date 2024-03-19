class PrimeNumber {
    public static void main(String[] args) {
        int num = 190; 
        // if the number is prime then multiply it by 2
     //  boolean isPrime = isPrimeOrNot(num);
       System.out.println(isPrimeOrNot(num) ? "Prime number" : "not a prime number");
    }

    static boolean isPrimeOrNot(int num){
        int count = 0;
        for(int i =1 ; i <= num ; i++){
            if(num % i == 0){
                count++;
            }
        }
        if(count == 2){
            return true;
        }else{
            return false;
        }
    }
}
