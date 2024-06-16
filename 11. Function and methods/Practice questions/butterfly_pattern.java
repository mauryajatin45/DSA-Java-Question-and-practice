public class butterfly_pattern {

    public static void shraddha(int n) {
        for (int i = 1; i <= n; i++) {

            for (int star = 1; star <= i; star++) {
                System.out.print("*");
            }
            int space = (2) * (n - i);
            for (; space > 0; space--) {
                System.out.print(" ");
            }

            for (int star = 1; star <= i; star++) {
                System.out.print("*");
            }

            System.out.println();
        }

        // FOR DOWNWARD PART
        for (int i = 1; i >= n; i--) {
            for (int star = 1; star <= i; star++) {
                System.out.print("*");
            }

            int space = (2) * (n - i);
            for (; space > 0; space++) {
                System.out.print(" ");
            }

            for (int star = 1; star <= i; star++) {
                System.out.print("*");
            }

            System.out.println();
        }
    }

    public static void main(String[] args) {
        shraddha(4);
    }
}
