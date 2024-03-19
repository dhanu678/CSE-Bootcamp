class PalindromeString {
    public static void main(String[] args) {
        String str = "abcaba";
     //   String reverseString = reverse(str);
      //  System.out.println(isPlaindrome(str));
        System.out.println(isPlaindrome1(str));
    }

    static boolean isPlaindrome(String str) {
        String newString = "";
        for (int i = str.length() - 1; i >= 0; i--) {
            newString = newString + str.charAt(i);
        }
        if (newString.equals(str)) {
            return true;
        } else {
            return false;
        }
    }

    static boolean isPlaindrome1(String str) {
        int left = 0;
        int right = str.length()-1;
        while (left < right) {
            if (str.charAt(left) != str.charAt(right)) {
                return false;
            }
            left++;
            right--;
        }
        return true;
    }

}
