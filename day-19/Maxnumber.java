class Maxnumber {
    public static void main(String[] args) {
        int a = 101;
        int b = 30;

        int max =max(a, b);
        int min = min(a, b);
        System.out.println(min);
        System.out.println(max * 2);
        // if(a > b) System.out.println(a);
        // else System.out.println(b);
    }

    static int max(int a, int b){
        if(a > b) return a;
        else return b;
    }

    static int min(int a, int b){
        if(a < b) return a;
        else return b;
    }

}
