import java.util.*;

public class Reverse_number {
    public static void main(String args[]) {
        int n = 2012006;
        while (n > 0) {
            int lastdigit = n % 10;
            System.out.print(lastdigit);
            n = n / 10;
        }

    }
}
