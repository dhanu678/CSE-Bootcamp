package inheritance;

public class Main {
    public static void main(String[] args) {
        // Parent p = new Parent();
        // Child c = new Child();
        Parent pc = new Child();
        System.out.println(pc.age);

        // System.out.println(p.name); ----- correct
        // System.out.println(p.roll); ----- correct
        // System.out.println(p.money); ----- incorrect not accesible with parent
        // reference
        // System.out.println(p.friends); ----- incorrect not accesible with parent
        // reference

        // System.out.println(c.name); // ----- correct
        // System.out.println(c.roll); // ----- correct
        // System.out.println(c.money); // ----- correct
        // System.out.println(c.friends); // ----- correct

        // System.out.println(pc.name); // ----- correct
        // System.out.println(pc.roll); // ----- correct
        // System.out.println(pc.money); // ----- incorrect not accesible with parent
        // // reference
        // System.out.println(pc.friends); // ----- incorrect not accesible with parent
        // reference

    }
}
