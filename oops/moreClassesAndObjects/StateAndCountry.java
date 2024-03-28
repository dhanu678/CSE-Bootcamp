package moreClassesAndObjects;

public class StateAndCountry {
    String state = "Maharashtra";
    String country;

    StateAndCountry() {

    }

    StateAndCountry(String state, String country) {
        this.state = state;
        this.country = country;
    }

    void printStateAndCountry() {
        System.out.println("State is: " + this.state);
        System.out.println("Country is: " + this.country);
    }
}
