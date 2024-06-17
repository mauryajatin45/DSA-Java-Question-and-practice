public class substring_addition {

    public static void add(int number[]) {
        for (int i = 0; i <= number.length; i++) {
            for (int j = i + 1; j <= number.length; j++) {
                int add=0;
                for (int k = i; k < j; k++) {
                    System.out.print(number[k] + " ");
                    add += (int) number[k];
                }
                System.out.println(" Addition = " + add);
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        int number[] = { 2, 4, 6, 8, 10 };
        add(number);
    }
}
