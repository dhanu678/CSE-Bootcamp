package oopsPillars.inheritance;

public class Child extends Parent {
    int houses = 10;

    void walk(){
        System.out.println("Child is walking........");
    }
    public static void main(String[] args) {
        Child ch = new Child();
        System.out.println(ch.name);
        System.out.println(ch.roll);
        System.out.println(ch.money);
        ch.greeting();
    }
}
