package constructors;

import java.util.Arrays;

public class Soham {
    String name;
    String[] friends;

    Soham() {
        // Soham s1 = new Soham("Soham", new String[]{"Shreya", "Atharva", "Dhanashri",
        // "Sakshi"});

        // this("Soham", new String[]{"Shreya", "Atharva", "Dhanashri", "Sakshi"});

    }

    Soham(String name, int friendsCount) {
        this.name = name;
        this.friends = new String[friendsCount];
    }

    static void printObject(Soham s) {
        System.out.println("*********************************************************************");
        System.out.println("The name is: " + s.name);
        System.out.println(s.name + " has " + s.friends.length + " friends");
       System.out.println("Friends: \n" + Arrays.toString(s.friends));
    }

    public static void main(String[] args) {
        Soham s1 = new Soham("S1", 5);
        Soham s2 = new Soham("S2", 0);
        Soham s3 = new Soham("S3", 10);
        Soham s4 = new Soham("S4", 15);
        Soham s5 = new Soham("S5", 20);
        printObject(s1);
        printObject(s2);
        printObject(s3);
        printObject(s4);
        printObject(s5);
    }
}
