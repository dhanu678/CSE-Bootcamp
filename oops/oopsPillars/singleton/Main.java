package oopsPillars.singleton;

public class Main {
    public static void main(String[] args) {
        Singleton s1 = Singleton.getSingleton();
        System.out.println(s1);
        
        Singleton s2 = Singleton.getSingleton();
        System.out.println(s2);

        Singleton s3 = Singleton.getSingleton();
        System.out.println(s3);

        Singleton s4 = Singleton.getSingleton();
        System.out.println(s4);

        Singleton s5 = Singleton.getSingleton();
        System.out.println(s5);
    }
}
