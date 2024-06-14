import java.util.*;

public class while_1_n {
    public static void main(String args[]) {
        int a = 1;
        System.out.println("Enter a number");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        while (a <= n) {
            System.out.println(a);
            a++;
        }
    }
}
