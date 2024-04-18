package oopsPillars.interfacesDemo.multipleInheritanceUsingInterface;

public class Child implements Parent1, Parent2 {
    @Override
    public void m1() {
        // System.out.println("Custom implementation");
        Parent1.super.m1();
        Parent1.super.m1();
        Parent2.super.m1();
        Parent2.super.m1();
    }

}
