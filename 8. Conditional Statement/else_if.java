import java.util.*;

public class else_if {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter First value");
        int a = sc.nextInt();
        System.out.println("Enter second value");
        int b = sc.nextInt();
        System.out.println("Enter third value");
        int c = sc.nextInt();

        if (a > b && a > c) {
            System.out.println("A is Greatest");
        } else if (b > c && b > a) {
            System.out.println("B is Greatest");
        } else {
            System.out.println("C is Greatest");
        }
    }
}
