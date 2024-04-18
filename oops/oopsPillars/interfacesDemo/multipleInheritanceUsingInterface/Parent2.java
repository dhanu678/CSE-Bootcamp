package oopsPillars.interfacesDemo.multipleInheritanceUsingInterface;

public interface Parent2 {
    //void m1();

    public default void m1() {
        System.out.println("This is a default methos from parent 2");
    }


    static void m2(){
        System.out.println("I am m2 method from parent 2");
    }
}
