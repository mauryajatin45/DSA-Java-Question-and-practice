import java.util.*;

public class checking_number {
    public static void main(String args[]) {
        do {
            System.out.println("Enter a number:");
            Scanner sc = new Scanner(System.in);
            int n = sc.nextInt();
            if (n % 10 == 0) {
                System.out.println("You have entered multiple of 10");
                break;
            }
        } while (true);
    }
}
