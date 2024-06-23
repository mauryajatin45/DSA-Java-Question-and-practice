public class Valid_palidrome {

    public static boolean isPalindrome(String str) {
        for (int i = 0; i < str.length() / 2; i++) {
            if (str.charAt(i) != str.charAt(str.length() - 1 - i)) {
                return true;
            }
        }
        return false;
    }

    public static void main(String[] args) {
        String str = "race a car";
        System.out.println(isPalindrome(str));
    }
}
