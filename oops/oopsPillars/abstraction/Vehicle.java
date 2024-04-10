package oopsPillars.abstraction;

public abstract class Vehicle {

    Vehicle(){
        this.engineStarts();
    }
    
    int num1 = 100;
    
    static int num2 = 100;

    public abstract void engineStarts();
    public abstract void engineStops();

    void greetings(){
        System.out.println("Hello world");
    }
}
