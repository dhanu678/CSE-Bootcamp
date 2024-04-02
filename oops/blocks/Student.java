package blocks;

public class Student {
    String name;
    int roll;
    // {
    // System.out.println("instance block --> 2");
    // }
    // static {
    // System.out.println("static block ---> 2");
    // }

    // static {
    // System.out.println("static block ---> 1");
    // }

    // {
    // System.out.println("instance block --> 1");
    // }

    {
        System.out.println("Outer block");
    }

    Student() {
        System.out.println("I am a constructor");
    }

    Student(String name, int roll) {
        this.name = name;
        this.roll = roll;
    }

    static void printObject(Student s) {
        System.out.println("-------------------------------------------------------");
        System.out.println(s.name);
        System.out.println(s.roll);
    }
}
