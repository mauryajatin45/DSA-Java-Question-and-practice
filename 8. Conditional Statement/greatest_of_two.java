import java.util.*;

public class greatest_of_two {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter First Value");
        int a = sc.nextInt();
        System.out.println("Enter second value");
        int b = sc.nextInt();
        if (a > b) {
            System.out.println(a + " is greatest.");
        } else {
            System.out.println(b + " is greatest.");
        }
    }
}
