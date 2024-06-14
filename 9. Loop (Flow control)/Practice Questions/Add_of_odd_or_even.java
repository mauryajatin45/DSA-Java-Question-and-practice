import java.util.*;

public class Add_of_odd_or_even {
    public static void main(String main[]) {
        Scanner sc=new Scanner(System.in);
        int a;
        int b;
        int even = 0;
        int odd = 0;
        System.out.println("Enter a number:");
        int n = sc.nextInt();
        while (n > 0) {
            int lastdigit = n % 10;
            if (lastdigit % 2 == 0) {
                a = lastdigit;

                even = even + a;
            } else {
                b = lastdigit;

                odd = odd + b;
            }
            n /= 10;
        }
        System.out.println("Even = " + even);
        System.out.println("Odd = " + odd);
    }
}
