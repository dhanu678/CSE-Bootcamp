class ConstructorDemo {

    ConstructorDemo(){
        
    }
    
    static String printName(){
       return "Hello World";
    }
    public static void main(String[] args) {
       String msg =  printName();
       System.out.println(msg);

       ConstructorDemo demo = new ConstructorDemo();
    }
}
