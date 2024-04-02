package oopsPillars.dataHiding;

public class Student {
    private String name;
    private int roll;

    Student() {

    }

    Student(String name, int roll) {
        this.name = name;
        this.roll = roll;
    }

    public String getName() {
        return this.name;
    }

    public int getRoll() {
        return this.roll;
    }

    void setName(String name){
        this.name = name;
    }

    void setRoll(int roll){
        this.roll = roll;
    }
}
