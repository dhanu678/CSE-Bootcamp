package oopsPillars.interfacesDemo;

public class Dog implements Animal {

    @Override
    public void sound() {
        System.out.println("bhow bhau");
    }

    @Override
    public void walk() {
        System.out.println("walking like a dog");
    }
}
