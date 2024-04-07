package oopsPillars.diffObjects;

public class Main {
    public static void main(String[] args) {
        // Car c1 = new Car();  // access from both i.e car and vehicle

        // Vehicle v1 = new Vehicle(); // access from vehicle

        // Vehicle v2 = new Car(); // acces only from vehicle

        // System.out.println(v1.engine);
        // System.out.println(v2.engine);
        // System.out.println(v2.tyres);
        // System.out.println(v2.brand);
        // System.out.println(v2.seats);

        // child class reference and child class object
        Car ch = new Car();
        System.out.println(ch.engine);

         // parent class reference and parent class object
        Vehicle vh  = new Vehicle();
        System.out.println(vh.engine);

          // parent class reference and child class object
        Vehicle vc = new Car();
        System.out.println(vc.engine);

        // clild class reference and parent class object --------CTE
        // Child cv = new Vehicle();
    }
}
