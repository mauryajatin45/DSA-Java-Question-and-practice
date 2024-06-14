import java.util.*;

public class prime_number {
    public static void main(String args[]) {
        System.out.println("Enter a number");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        boolean isPrime = true;
        for (int i = 2; i <= n - 1; i++) {
            if (n % i == 0) {
                isPrime = false;
            }
        }
        if (isPrime == true) {
            System.out.println("Prime number");
        } else {
            System.out.println("Not a Prime number");

        }
    }
}
