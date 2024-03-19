class Method1 {
    public static void main(String[] args) {

        armstrongInRange(0, 1000);
    }

    static boolean isArmstrong(int num){
        int sum = 0;
        int temp = num;
        while(num != 0){
            int digit = num % 10;
            num = num / 10;
            sum = sum + (digit * digit * digit);
        }
        if(sum == temp) return true;
        else return false;
    }
    
    static void armstrongInRange(int start, int end){
        for(int i = start ; i <= end ; i++){
            boolean isArmstrong = isArmstrong(i);
            System.out.print(isArmstrong ? i + " " : "");
        }
        System.out.println();
    }
}
