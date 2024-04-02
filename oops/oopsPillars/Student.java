package oopsPillars;

public class Student {


    private String name;
    private int roll;

    private Student() {

    }

    private Student(String name, int roll) {
        this.name = name;
        this.roll = roll;
    }

    static void printObject(Student s){
        System.out.println(s.name);
        System.out.println(s.roll);
    }

    public static void main(String[] args) {
        Student s1 = new Student("Ayush", 10);
        Student s2 = new Student();
        // System.out.println(s1.name);
        // System.out.println(s1.roll);
        // Student.printObject(s1);
        Student.printObject(s2);
    }
}