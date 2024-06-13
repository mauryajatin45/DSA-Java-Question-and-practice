import java.util.*;

public class Bill {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the value of a pencil");
        int pencil = sc.nextInt();
        System.out.println("Enter the value of a pen ");
        int pen = sc.nextInt();
        System.out.println("Enter the value of a eraser");
        int eraser = sc.nextInt();
        float gst = (pencil + pen + eraser) * 0.18f;
        float bill = gst + pencil + pen + eraser;
        System.out.println("Total bill = "  + bill);
    }
}
