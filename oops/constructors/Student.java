package constructors;

public class Student {
  String name;
  int roll;
  String address;
  float marks;
  long mobile;
  String id;

  Student() {
   
  }

  Student(int roll, String name) {
    this.name = name;
    this.roll = roll;
  }

  Student(String name, int roll, String address, float marks) {
    this(roll, name);
    this.address = address;
    this.marks = marks;
  }

  Student(String name, int roll, String address, float marks, long mobile, String id) {
    this.name = name;
    this.roll = roll;
    this.address = address;
    this.marks = marks;
    this.mobile = mobile;
    this.id = id;
  }

  void printObject() {
    System.out.println("------------------------------------------------------");
    System.out.println(this.name);
    System.out.println(this.roll);
    System.out.println(this.address);
    System.out.println(this.marks);
    System.out.println(this.mobile);
    System.out.println(this.id);
  }

  public static void main(String[] args) {

    // Student s1 = new Student("Atharva", 18, "Pune", 35.55f, 99999999999l, "Aadhar card");
    Student s1 = new Student();
    s1.name = "Rohini";
    s1.roll = 18;
    s1.printObject();
  }

}
