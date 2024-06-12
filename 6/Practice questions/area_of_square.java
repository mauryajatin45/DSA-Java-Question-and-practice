import java.util.*;
public class area_of_square {
    public static void main(String args[]){
        System.out.println("Enter a value of side.");
        Scanner sc = new Scanner(System.in);
        int side = sc.nextInt();
        int area = side*side;
        System.out.println("Area of square = " + area);
    }
}
