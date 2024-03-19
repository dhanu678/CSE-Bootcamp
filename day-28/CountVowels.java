class CountVowels {
    public static void main(String[] args) {
        String str = "dhanashri";
        // vowels : a e i o u
        int vowelCount = 0;
        int consonantCount = 0;
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
                vowelCount++;
            } else {
                consonantCount++;
            }
        }

       // System.out.println("Vowels: " + vowelCount + ", Consonants: " + consonantCount);

        char ch = 'a';
        System.out.println((char) (ch - 32));

        char ch2 = 'A';
        System.out.println((char) (ch2 + 32));
        // toUpperCase
        // toLowerCase
    }
}
