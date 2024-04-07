package oopsPillars.encapsulation;

public class Main {
     static public void main(String[] args) {
        Student s1 = new Student();
        System.out.println(Student.getName());
        Student.setName("Rohini");
        System.out.println(Student.getName());
    }
}
