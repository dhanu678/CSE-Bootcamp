package oopsPillars.polymorphism;

public class Student {
    String name;
    int roll;

    void behavaiour() {
        System.out.println("He is a Student");
    }

    void behavaiour(String name) {
        System.out.println("He is a Son");
    }

    void behavaiour(int roll) {
        System.out.println("He is a Friend");
    }

    void behavaiour(String name, int roll) {
        System.out.println("He is a Enemy");
    }


    public static void main(String[] args) {
        Student s = new Student();
        s.behavaiour();
        s.behavaiour("Atharva");
        s.behavaiour(14);
        s.behavaiour("Shreya", 14);
        // s.behavaiour(14,"Dhanashree");

        String name = "Rohini";
        String lastname = "Nagthane";

        String fullName = name + lastname;
        System.out.println(fullName);
    }
}
