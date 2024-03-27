class Student {

    String name;
    int roll;
    float marks;

    Student(){
        name = "Some Name";
        roll = 100;
    }

    Student(String name1, int roll1) {
        name = name1;
        roll = roll1;
    }

    Student(String name1, int roll1, float marks1) {
        name = name1;
        roll = roll1;
        marks = marks1;
    }

    int printObject() {
        System.out.println(name);
        System.out.println(roll);
        System.out.println(marks);
        return 0;
    }

    public static void main(String[] args) {

        // String name = "XYZ";
        Student s1 = new Student();
        
        int methodCall = s1.printObject();

        System.out.println("--------------------------------------");
        Student s2 = new Student("Rohini", 34, 23.23f);
        s2.printObject();
    }
}
