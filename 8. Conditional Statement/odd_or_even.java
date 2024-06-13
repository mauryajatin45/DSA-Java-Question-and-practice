import java.util.*;

public class odd_or_even {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Check weather the number is odd or even");
        int check = sc.nextInt();
        if (check%2==0){
            System.out.println("Even");
        }else{
            System.out.println("Odd");
        }
    }
}
