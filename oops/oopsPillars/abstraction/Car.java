package oopsPillars.abstraction;

public class Car extends Vehicle {

    Car(){
        super();
    }
    
    public void engineStarts() {
        System.out.println("Car engine starts");
    }

    public void engineStops() {
        System.out.println("Car engine stops");
    }
}
