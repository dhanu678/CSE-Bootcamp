class Pen {
    int length = 10;
    String color = "blue";

    void write(){
        System.out.println("Write with this pen");
    }

    void weapon(){
        System.out.println("Use it as a weapon");
    }

    void game(){
        System.out.println("Use me as a game");
    }

    public static void main(String[] args) {
        Pen p1 = new Pen();
        p1.write();

      
        // p1.length = 10;
        // p1.color = "Red";
        System.out.println(p1.length);
        System.out.println(p1.color);

        Pen p2 = new Pen();
        // p2.length = 100;
        // p2.color = "Pink";
        System.out.println(p2.length);
        System.out.println(p2.color);
    }
}
