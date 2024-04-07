package oopsPillars.encapsulation;

public class Student {
    private static String name = "Soham";
    private int roll;

    Student() {

    }

    Student(String name, int roll) {
        Student.name = name;
        this.roll = roll;
    }

    public static String getName() {
        return Student.name;
    }

    public static void setName(String name) {
        Student.name = name;
    }

    public int getRoll() {
        return this.roll;
    }

    public void setRoll(int roll) {
        if (roll < 1) {
            System.out.println("The roll number is invalid");
        } else {
            this.roll = roll;
        }
    }

    public static void main(String[] args) {
        Student s1 = new Student();
        System.out.println(s1.name);
        System.out.println(s1.roll);
    }
}
