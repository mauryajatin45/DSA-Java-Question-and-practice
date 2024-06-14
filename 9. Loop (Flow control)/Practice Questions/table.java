import java.util.*;

public class table {
    public static void main(String args[]) {
        System.out.println("Enter a number to get table of:");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        for (int i = 1; i <= 10; i++) {
            System.out.println(n + " x " + i + " = " + (n * i));
        }

    }
}
