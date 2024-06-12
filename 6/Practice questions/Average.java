import java.util.*;

public class Average {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter first value:");
        int a = sc.nextInt();
        System.out.println("Enter second value:");
        int b = sc.nextInt();
        System.out.println("Enter third value:");
        int c = sc.nextInt();

        int d = (a + b + c) / 3;
        System.out.println("Average = " + d);

    }

}
