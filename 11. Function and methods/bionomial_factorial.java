import java.util.*;

public class bionomial_factorial {
    public static int fact(int n) {
        int factorial = 1;
        for (int i = 1; i <= n; i++) {
            factorial = factorial * i;
        }
        return factorial;
    }

    public static void main(String args[]) {
        int upper_fact = fact(5);
        int leftside_fact = fact(2);
        int rightside_fact = fact(5 - 2);
        System.out.println("Bionomail factorial = " + (upper_fact) / ((leftside_fact) * (rightside_fact)));
    }
}
