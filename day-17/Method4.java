class Method4 {
    public static void main(String[] args) {
        greeting("Atharva");
        greeting("Dhanashree");
        String name = "Sakshi";
        greeting(name);

        String naav = "Shreya";
        greeting(naav);
        greeting("Soham");
    }


    static void greeting(String name){
        System.out.println("Nice to meet you, " + name);
    }
}
