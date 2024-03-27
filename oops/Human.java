class Human {
    String name;
    String idProof;
    static int population = 10000;

    Human() {

    }

    Human(String name, String idProof) {
        this.name = name;
        this.idProof = idProof;
    }

    Human(String name, String idProof, int population) {
        this.name = name;
        this.idProof = idProof;
        this.population = population;
    }

    void printObject() {
        System.out.println(this.name);
        System.out.println(this.idProof);
        System.out.println(this.population);
    }

    static void greetings(){
        System.out.println("Hello world");
    }
    public static void main(String[] args) {

        Human h1 = new Human("Atharva", "Pan Card");
        // Human h2 = new Human("Dhanashri", "Aadhar Card");
        // Human h3 = new Human("Rohini", "Driving Liscence");
        // Human h4 = new Human("Shreya", "Voter Id");

        // Human h5 = new Human("Ayush", "Pan Card");
        // Human h6 = new Human("Sakshi", "Aadhar Card");
        // Human h7 = new Human("Soham", "Driving Liscence");
        // Human h8 = new Human("Soham2", "Voter Id");

        // Human.population = 300000;

        // Human.population = 500000;


        // System.out.println("--------------------------------");
        // h1.printObject();
        // System.out.println("--------------------------------");
        // h2.printObject();

        // System.out.println("--------------------------------");
        // h3.printObject();

        // System.out.println("--------------------------------");
        // h4.printObject();
        // System.out.println("--------------------------------");
        // h5.printObject();
        // System.out.println("--------------------------------");
        // h6.printObject();

        // System.out.println("--------------------------------");
        // h7.printObject();

        // System.out.println("--------------------------------");
        // h8.printObject();

       greetings();
    }
}
