public class subpair {

    public static void pairsprinting(int number[]) {

        for (int i = 0; i < number.length; i++) {

            for (int j = i + 1; j <= number.length; j++) {

                for (int k = i; k < j; k++) {
                    System.out.print(number[k] + " ");
                }
                System.out.println();
            }
            System.out.println();
        }

    }

    public static void main(String[] args) {
        int number[] = { 2, 4, 6, 8, 10 };
        pairsprinting(number);
    }
}
