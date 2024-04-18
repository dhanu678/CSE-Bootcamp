package oopsPillars.interfacesDemo.multipleInheritanceUsingInterface;

public interface Parent1 {
    public default void m1() {
        System.out.println("This is a default methos from parent 1");
    }

    static void m2() {
        System.out.println("I am m2 method from parent 1");
    }
}
