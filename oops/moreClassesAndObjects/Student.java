package moreClassesAndObjects;

public class Student {
    String name;
    int roll;
    Address address;

    Student() {

    }

    Student(String name, int roll) {
        this.name = name;
        this.roll = roll;
        // this.address = new Address("Karad", 415110, "Maharashtra");
    }

    Student(String name, int roll, Address address) {
        this.name = name;
        this.roll = roll;
        this.address = address;
    }

    Student(String name, int roll, String city, int pincode, String state, String country) {
        this.name = name;
        this.roll = roll;
        this.address = new Address(city, pincode, state, country);
    }

    void printObject() {
        System.out.println("---------------------------------------------");
        System.out.println("Name is: " + this.name);
        System.out.println("Roll No. is: " + this.roll);
        this.address.printAddress();
    }

    public static void main(String[] args) {
        // Address a1 = new Address("Satara", 415003, "Maharashtra");
        // Student s1 = new Student("Atharva", 10);
        // s1.printObject();
        // s1.address.printAddress();
        // // s1.printAddress(); ---- invalid because printaddress is not present insid
        // my student object
        // Student s2 = new Student("Soham", 43, new Address("Pune", 411038,
        // "Maharashtra"));
        // // s2.printObject();
        // System.out.println("-------------------------------------------------------------------");
        // Student s1 = new Student("Soham", 43);
        // System.out.println(s1.name);
        // System.out.println(s1.roll);
        // // System.out.println(s1.address);
        // System.out.println(s1.address.city);
        // System.out.println(s1.address.pincode);
        // System.out.println(s1.address.state);
        Student s1 = new Student("Sakshi", 12, "Satara", 1231231, "Maharashtra", "India");
        s1.printObject();

       
    }
}