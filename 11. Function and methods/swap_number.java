import java.util.*;

public class swap_number {

    public static void swap(int a, int b) {
        int c = a;
        a = b;
        b = c;
        System.out.println("a = " + a);
        System.out.println("b = " + b);
        return;
    }

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter first number");
        int fvalue = sc.nextInt();
        System.out.println("Enter second number");
        int svalue = sc.nextInt();
        swap(fvalue, svalue);
    }
}
