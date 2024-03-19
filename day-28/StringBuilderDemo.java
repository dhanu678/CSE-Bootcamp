class StringBuilderDemo {
    public static void main(String[] args) {
        StringBuilder str = new StringBuilder("Atharva");
        str.append(" Shirke");

        String name = "Atharva";
       // name.append(" Shirke");  // we can't do this in String
       name = name + " " + "Shirke";

        System.out.println(name);
     //   System.out.println(str);
        // System.out.println(str);
    }
}
