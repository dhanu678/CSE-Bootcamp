package oopsPillars.interfacesDemo;

public class Cat implements Animal{

    @Override
    public void sound() {
        System.out.println("meow meow");
    }

    @Override
    public void walk() {
        System.out.println("walking like a cat");
    }
}
