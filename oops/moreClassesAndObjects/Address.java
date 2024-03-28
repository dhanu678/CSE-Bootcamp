package moreClassesAndObjects;

public class Address {
    String city;
    int pincode;
    StateAndCountry sc = new StateAndCountry();

    Address() {

    }

    Address(String city, int pincode, String state, String country) {
        this.city = city;
        this.pincode = pincode;
        this.sc.state = state;
        this.sc.country = country;
       // this.sc = new StateAndCountry(state, country);
    }

    void printAddress() {
        System.out.println("City is: " + this.city);
        System.out.println("Pincode is: " + this.pincode);
        this.sc.printStateAndCountry();
        // System.out.println(this.state);
    }
}
