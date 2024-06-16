import java.util.*;

public class input_output {
    public static void main(String[] args) {
        int marks[] = new int[48];
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the marks of DBMS");
        marks[0] = sc.nextInt();
        System.out.println("Enter the marks of RDBMS");
        marks[1] = sc.nextInt();
        System.out.println("Enter the marks of SMP");
        marks[2] = sc.nextInt();
        System.out.println("Marks of DBMS = " + marks[0]);
        System.out.println("Marks of RDBMS = " + marks[1]);
        System.out.println("Marks of SMP = " + marks[2]);
        int perecntage = ((marks[0] + marks[1] + marks[2])/3);
        System.out.println("percentage = " + perecntage + "%" );
    }
}