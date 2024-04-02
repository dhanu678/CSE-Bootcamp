package oopsPillars.dataHiding;

public class Main {
    public static void main(String[] args) {
        Student s1 = new Student("Soham", 100);
        // s1.name = "Sakshi";
        // s1.roll = 10;

        s1.setName("Dhanashree");
        s1.setRoll(12);
        System.out.println(s1.getName());
        System.out.println(s1.getRoll());
    }
}
