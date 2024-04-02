package constructors;

public class Dhanashree {
    String name;
    int roll;

    Dhanashree() {

    }

    Dhanashree(String name, int roll) {
        this.name = name;
        this.roll = roll;
    }

    static void printObject(Dhanashree d) {
        // Dhanashree d = new Dhanashree("Dhanashree", 1000);
        System.out.println("***************************************************");
        System.out.println("The name is: " + d.name);
        System.out.println("The roll no. is: " + d.roll);
    }

    public static void main(String[] args) {
        Dhanashree d1 = new Dhanashree("D1", 1);
        Dhanashree d2 = new Dhanashree("D2", 2);
        Dhanashree d3 = new Dhanashree("D3", 3);
        Dhanashree d4 = new Dhanashree("D4", 4);
        Dhanashree d5 = new Dhanashree("D5", 5);

        Dhanashree.printObject(d1);
        Dhanashree.printObject(d5);
        // d3.printObject();
        // d4.printObject();
        // d5.printObject();

    }
}
