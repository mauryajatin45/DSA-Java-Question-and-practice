import java.util.*;
public class sum_of_n_number {
    public static void main(String args[]){
        System.out.println("Enter a number");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int sum=0;
        int a=1;
        while (a<=n) {
            sum=sum+a;
            a++;
        }
        System.out.println(sum);
    }
}
