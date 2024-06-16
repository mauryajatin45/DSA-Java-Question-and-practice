public class palindrome {

    public static void palin(int n) {
        int originalNumber = n;
        int reversedNumber = 0;

        while (n > 0) {
            int lastDigit = n % 10;
            reversedNumber = reversedNumber * 10 + lastDigit;
            n /= 10;
        }

        if (originalNumber == reversedNumber) {
            System.out.println(originalNumber + " is a palindrome.");
        } else {
            System.out.println(originalNumber + " is not a palindrome.");
        }
    }

    public static void main(String args[]) {
        palin(121);  // Example number to check
    }
}
