import java.util.*;

public class continue_statement {
    public static void main(String args[]) {
        do {
            System.out.println("Enter Number");
            Scanner sc = new Scanner(System.in);
            int input = sc.nextInt();
            if (input % 10 == 0) {
                continue;
            }
            System.out.println(input);
        } while (true);
    }
}
