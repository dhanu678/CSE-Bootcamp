package oopsPillars.inheritance.references;

public class Child extends Parent {
    String job;
    // int money = 0;

    Child() {
        // System.out.println(super.money);
    }

    Child(String job, int money) {
        this.job = job;
        this.money = money;
    }

    // Child(String job, int pocketmoney, int money, String car) {
    //     // super(money, car);
    //     // this(job, pocketmoney);
    //     this.job = job;
    //     this.money = pocketmoney;
    // }

}
