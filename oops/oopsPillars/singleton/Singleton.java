package oopsPillars.singleton;

public class Singleton {

    private static Singleton s1;

    private Singleton() {

    }

    static Singleton getSingleton() {
        if (s1 == null) {
            s1 = new Singleton();
        }
        return s1;
    }
}
