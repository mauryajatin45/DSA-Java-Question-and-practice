public class prime_optimised {

    public static boolean opt_prime(int n) {
        for (int i = 2; i <= Math.sqrt(n); i++) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }

    public static void main(String args[]) {
        System.out.println(opt_prime(8));
    }
}
