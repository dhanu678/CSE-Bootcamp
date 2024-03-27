 class Rohini{

    int height;
    int weight;

    Rohini(){

    }
    
    Rohini(int height, int weight){
        this.height = height;
        this.weight = weight;
    }

    void dance(){
        System.out.println("Rohini can dance");
    }

    void cook(){
        System.out.println("Rohini can cook");
    }

    public static void main(String[] args){
        Rohini r1 = new Rohini(100, 200);
        r1.height = 100;
        r1.dance();
        Rohini r2 = new Rohini();
        r2.height = 1000;
        r2.dance();
    }
 }