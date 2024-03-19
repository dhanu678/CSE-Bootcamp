class Methods4 {
    public static void main(String[] args) {
        int remaining = soham(150);
        System.out.println("Mother got back the money: "+remaining);   
        int remaining2 = soham(remaining);
        System.out.println("Mother got back the money again: "+ remaining2);
    }

    // void means it returns nothing
    static int soham(int money){
        int price = 70;
        System.out.println("Bhaji gheun aloy me");
        int remaining = money - price;
        System.out.println(remaining + " rupaye Rahilet");
        return remaining;
    }
}
