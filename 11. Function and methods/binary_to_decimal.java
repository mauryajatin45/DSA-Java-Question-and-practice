import java.util.*;

public class binary_to_decimal {
    public static void main(String args[]) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter a binary to find the decimal of it:");
        int n = sc.nextInt();
        int get = 0;
        int storage = 0;
        int lastdigit;
        while (n > 0) {
            lastdigit = (n % 10);
            storage += lastdigit * (int) Math.pow(2, get);
            get++;
            n /= 10;
        }
        System.out.println(storage);
    }

}
