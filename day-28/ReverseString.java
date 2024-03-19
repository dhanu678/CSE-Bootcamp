class ReverseString {
    public static void main(String[] args) {
        // String str = "Sakshi";
        // // System.out.println(reverse(str));
        // str = reverse(str);
        // // System.out.println(newString);
        // System.out.println("orignal String: " + str);
        StringBuilder str = new StringBuilder("Shreya");
        str.reverse();
        System.out.println(str);
    }

    static String reverse(String str) {
        String newString = "";
        for (int i = str.length() - 1; i >= 0; i--) {
            newString = newString + str.charAt(i);
        }
        return newString;
    }
}
