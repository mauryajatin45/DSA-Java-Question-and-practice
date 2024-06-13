import java.util.*;

public class negative_or_positive {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number to check weather it is negative or positive:");
        int a = sc.nextInt();
        if (a > 0) {
            System.out.println("Positive");
        } else if (a == 0) {
            System.out.println("It's zero");
        } else {
            System.out.println("Negative");

        }
    }
}
