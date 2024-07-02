public class Decreasing_order {

    public static void dec(int n) {
        if (n == 1) {
            System.out.println(n);
            return;
        }
        System.out.println(n);
        dec(n - 1);
    }

    public static void main(String[] args) {
        dec(10);
    }
}