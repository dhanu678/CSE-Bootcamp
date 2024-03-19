class EvenOrOdd {
    public static void main(String[] args) {
        // if num is odd then add 10 into in it
        // but if it is even add 20 in it 
        int num = 321;
        // evenOrOdd(num);
        // evenOrOdd(44);
        boolean isEvenorOdd = evenOrOdd(num);
        System.out.println(isEvenorOdd ? "Even number" : "Odd Number");
    }

    static boolean evenOrOdd(int num){
        if(num % 2 == 0){
            return true;
        } 
        else {
            return false;
        }
    }
}
