package oopsPillars.interfacesDemo.inheritanceBetweenInterfaces;

public class ChildImplementer implements Child {

    @Override
    public void m1() {
        System.out.println("Unimplemented method 'm1'");
    }

    @Override
    public void greetings() {
        System.out.println("Unimplemented method 'greetings'");
    }

    @Override
    public void m2() {
        System.out.println("Unimplemented method 'm2'");
    }

    @Override
    public void multiplication() {
        System.out.println("Unimplemented method 'multiplication'");
    }

}
