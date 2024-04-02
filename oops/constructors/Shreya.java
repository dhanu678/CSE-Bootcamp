package constructors;

public class Shreya {
    long money;
    String car;

    Shreya(long money, String car) {
        this.money = money;
        this.car = car;
    }

    Shreya() {
        this.money = 10000000000l;
        this.car = "BMW";
    }

    public static void main(String[] args) {
        // long money = 10000000000l;
        // String car = "BMW";
        Shreya s1 = new Shreya();

        System.out.println(s1.money);
        System.out.println(s1.car);
    }
}
