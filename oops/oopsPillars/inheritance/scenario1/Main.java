package oopsPillars.inheritance.scenario1;

public class Main {
    public static void main(String[] args) {
        Bike b1 = new Bike();
        System.out.println(b1.engine);
        System.out.println(b1.tyres);
        System.out.println(b1.riders);
        b1.offRoading();
        b1.vehicleStart();
        b1.vehicleStop();
    }
}
