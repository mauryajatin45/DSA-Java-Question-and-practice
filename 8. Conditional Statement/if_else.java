import java.util.*;

public class if_else {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Your age: ");
        int age = sc.nextInt();
        if (age >= 18) {
            System.out.println("You are eligiable to Vote");
        } else {
            System.out.println("You are not eligiable to vote");
        }
    }

}